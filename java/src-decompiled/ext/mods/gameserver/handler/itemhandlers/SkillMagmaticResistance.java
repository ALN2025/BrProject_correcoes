// Bytecode for: ext.mods.gameserver.handler.itemhandlers.SkillMagmaticResistance
// File: ext\mods\gameserver\handler\itemhandlers\SkillMagmaticResistance.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance.class
  Last modified 9 de jul de 2026; size 2313 bytes
  MD5 checksum 288dcbc2456b351fb8ec7e2b04309161
  Compiled from "SkillMagmaticResistance.java"
public class ext.mods.gameserver.handler.itemhandlers.SkillMagmaticResistance implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance.clanSkills:[I
    #8 = Class              #10           // ext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance
    #9 = NameAndType        #11:#12       // clanSkills:[I
   #10 = Utf8               ext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance
   #11 = Utf8               clanSkills
   #12 = Utf8               [I
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Player
   #14 = Utf8               ext/mods/gameserver/model/actor/Player
   #15 = Methodref          #13.#16       // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #16 = NameAndType        #17:#18       // isClanLeader:()Z
   #17 = Utf8               isClanLeader
   #18 = Utf8               ()Z
   #19 = Methodref          #20.#21       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #20 = Class              #22           // ext/mods/gameserver/data/SkillTable
   #21 = NameAndType        #23:#24       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #22 = Utf8               ext/mods/gameserver/data/SkillTable
   #23 = Utf8               getInstance
   #24 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #25 = Methodref          #20.#26       // ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
   #26 = NameAndType        #27:#28       // getMaxLevel:(I)I
   #27 = Utf8               getMaxLevel
   #28 = Utf8               (I)I
   #29 = Methodref          #20.#30       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #30 = NameAndType        #31:#32       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #31 = Utf8               getInfo
   #32 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #33 = Methodref          #13.#34       // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #34 = NameAndType        #35:#36       // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #35 = Utf8               addSkill
   #36 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
   #37 = Methodref          #13.#38       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #38 = NameAndType        #39:#40       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #39 = Utf8               getClan
   #40 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #41 = Methodref          #42.#43       // ext/mods/gameserver/model/pledge/Clan.addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #42 = Class              #44           // ext/mods/gameserver/model/pledge/Clan
   #43 = NameAndType        #45:#36       // addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #44 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #45 = Utf8               addClanSkill
   #46 = Class              #47           // ext/mods/gameserver/network/serverpackets/SkillList
   #47 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
   #48 = Methodref          #46.#49       // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #49 = NameAndType        #5:#50        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #51 = Methodref          #13.#52       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = NameAndType        #53:#54       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Utf8               sendPacket
   #54 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = Methodref          #42.#56       // ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
   #56 = NameAndType        #57:#6        // updateClanInDB:()V
   #57 = Utf8               updateClanInDB
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #59 = Class              #61           // ext/mods/gameserver/model/item/instance/ItemInstance
   #60 = NameAndType        #62:#63       // getObjectId:()I
   #61 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #62 = Utf8               getObjectId
   #63 = Utf8               ()I
   #64 = Methodref          #65.#66       // ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
   #65 = Class              #67           // ext/mods/gameserver/model/actor/Playable
   #66 = NameAndType        #68:#69       // destroyItem:(IIZ)Z
   #67 = Utf8               ext/mods/gameserver/model/actor/Playable
   #68 = Utf8               destroyItem
   #69 = Utf8               (IIZ)Z
   #70 = Methodref          #13.#71       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #71 = NameAndType        #72:#6        // broadcastUserInfo:()V
   #72 = Utf8               broadcastUserInfo
   #73 = String             #74           // You are not the clan leader.
   #74 = Utf8               You are not the clan leader.
   #75 = Methodref          #13.#76       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #76 = NameAndType        #77:#78       // sendMessage:(Ljava/lang/String;)V
   #77 = Utf8               sendMessage
   #78 = Utf8               (Ljava/lang/String;)V
   #79 = Class              #80           // ext/mods/gameserver/handler/IItemHandler
   #80 = Utf8               ext/mods/gameserver/handler/IItemHandler
   #81 = Utf8               Code
   #82 = Utf8               LineNumberTable
   #83 = Utf8               LocalVariableTable
   #84 = Utf8               this
   #85 = Utf8               Lext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance;
   #86 = Utf8               useItem
   #87 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #88 = Utf8               s
   #89 = Utf8               I
   #90 = Utf8               clanSkill
   #91 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #92 = Utf8               var7
   #93 = Utf8               var5
   #94 = Utf8               var6
   #95 = Utf8               player
   #96 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #97 = Utf8               playable
   #98 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #99 = Utf8               item
  #100 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #101 = Utf8               forceUse
  #102 = Utf8               Z
  #103 = Utf8               StackMapTable
  #104 = Class              #12           // "[I"
  #105 = Class              #106          // ext/mods/gameserver/skills/L2Skill
  #106 = Utf8               ext/mods/gameserver/skills/L2Skill
  #107 = Utf8               SourceFile
  #108 = Utf8               SkillMagmaticResistance.java
{
  public ext.mods.gameserver.handler.itemhandlers.SkillMagmaticResistance();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_1
         6: newarray       int
         8: dup
         9: iconst_0
        10: sipush        385
        13: iastore
        14: putfield      #7                  // Field clanSkills:[I
        17: return
      LineNumberTable:
        line 28: 0
        line 30: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=4
         0: aload_1
         1: instanceof    #13                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          147
         7: aload_1
         8: checkcast     #13                 // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: aload         4
        15: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        18: ifeq          140
        21: aload_0
        22: getfield      #7                  // Field clanSkills:[I
        25: astore        5
        27: aload         5
        29: arraylength
        30: istore        6
        32: iconst_0
        33: istore        7
        35: iload         7
        37: iload         6
        39: if_icmpge     99
        42: aload         5
        44: iload         7
        46: iaload
        47: istore        8
        49: invokestatic  #19                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        52: iload         8
        54: invokestatic  #19                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        57: iload         8
        59: invokevirtual #25                 // Method ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
        62: invokevirtual #29                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        65: astore        9
        67: aload         9
        69: ifnull        81
        72: aload         4
        74: aload         9
        76: iconst_1
        77: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
        80: pop
        81: aload         4
        83: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        86: aload         9
        88: iconst_1
        89: invokevirtual #41                 // Method ext/mods/gameserver/model/pledge/Clan.addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
        92: pop
        93: iinc          7, 1
        96: goto          35
        99: aload         4
       101: new           #46                 // class ext/mods/gameserver/network/serverpackets/SkillList
       104: dup
       105: aload         4
       107: invokespecial #48                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       110: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: aload         4
       115: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       118: invokevirtual #55                 // Method ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
       121: aload_1
       122: aload_2
       123: invokevirtual #58                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       126: iconst_1
       127: iconst_0
       128: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
       131: pop
       132: aload         4
       134: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       137: goto          147
       140: aload         4
       142: ldc           #73                 // String You are not the clan leader.
       144: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       147: return
      LineNumberTable:
        line 38: 0
        line 40: 7
        line 41: 13
        line 43: 21
        line 44: 27
        line 46: 32
        line 48: 42
        line 49: 49
        line 50: 67
        line 52: 72
        line 55: 81
        line 46: 93
        line 58: 99
        line 60: 113
        line 61: 121
        line 62: 132
        line 63: 137
        line 66: 140
        line 70: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      44     8     s   I
           67      26     9 clanSkill   Lext/mods/gameserver/skills/L2Skill;
           35      64     7  var7   I
           27     110     5  var5   [I
           32     105     6  var6   I
           13     134     4 player   Lext/mods/gameserver/model/actor/Player;
            0     148     0  this   Lext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance;
            0     148     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     148     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     148     3 forceUse   Z
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/handler/itemhandlers/SkillMagmaticResistance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, class "[I", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ int, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 248 /* chop */
          offset_delta = 17
        frame_type = 249 /* chop */
          offset_delta = 40
        frame_type = 250 /* chop */
          offset_delta = 6
}
SourceFile: "SkillMagmaticResistance.java"
