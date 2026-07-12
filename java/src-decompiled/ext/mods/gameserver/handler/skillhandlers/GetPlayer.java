// Bytecode for: ext.mods.gameserver.handler.skillhandlers.GetPlayer
// File: ext\mods\gameserver\handler\skillhandlers\GetPlayer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/GetPlayer.class
  Last modified 9 de jul de 2026; size 1954 bytes
  MD5 checksum bbe8524e539b54dcd8131427d9e7d258
  Compiled from "GetPlayer.java"
public class ext.mods.gameserver.handler.skillhandlers.GetPlayer implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/handler/skillhandlers/GetPlayer
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Creature
   #9 = NameAndType        #11:#12        // isAlikeDead:()Z
  #10 = Utf8               ext/mods/gameserver/model/actor/Creature
  #11 = Utf8               isAlikeDead
  #12 = Utf8               ()Z
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #14 = Class              #16            // ext/mods/gameserver/model/WorldObject
  #15 = NameAndType        #17:#18        // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #16 = Utf8               ext/mods/gameserver/model/WorldObject
  #17 = Utf8               getActingPlayer
  #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #19 = Methodref          #20.#9         // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #20 = Class              #21            // ext/mods/gameserver/model/actor/Player
  #21 = Utf8               ext/mods/gameserver/model/actor/Player
  #22 = Methodref          #8.#23         // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #23 = NameAndType        #24:#25        // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #24 = Utf8               getPosition
  #25 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #26 = Methodref          #20.#27        // ext/mods/gameserver/model/actor/Player.instantTeleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #27 = NameAndType        #28:#29        // instantTeleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #28 = Utf8               instantTeleportTo
  #29 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #30 = Fieldref           #31.#32        // ext/mods/gameserver/handler/skillhandlers/GetPlayer.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #31 = Class              #33            // ext/mods/gameserver/handler/skillhandlers/GetPlayer
  #32 = NameAndType        #34:#35        // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #33 = Utf8               ext/mods/gameserver/handler/skillhandlers/GetPlayer
  #34 = Utf8               SKILL_IDS
  #35 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #36 = Class              #37            // ext/mods/gameserver/enums/skills/SkillType
  #37 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #38 = Fieldref           #36.#39        // ext/mods/gameserver/enums/skills/SkillType.GET_PLAYER:Lext/mods/gameserver/enums/skills/SkillType;
  #39 = NameAndType        #40:#41        // GET_PLAYER:Lext/mods/gameserver/enums/skills/SkillType;
  #40 = Utf8               GET_PLAYER
  #41 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #42 = Class              #43            // ext/mods/gameserver/handler/ISkillHandler
  #43 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #44 = Utf8               Code
  #45 = Utf8               LineNumberTable
  #46 = Utf8               LocalVariableTable
  #47 = Utf8               this
  #48 = Utf8               Lext/mods/gameserver/handler/skillhandlers/GetPlayer;
  #49 = Utf8               useSkill
  #50 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #51 = Utf8               victim
  #52 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #53 = Utf8               target
  #54 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #55 = Utf8               creature
  #56 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #57 = Utf8               skill
  #58 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #59 = Utf8               targets
  #60 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #61 = Utf8               item
  #62 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #63 = Utf8               StackMapTable
  #64 = Class              #60            // "[Lext/mods/gameserver/model/WorldObject;"
  #65 = Utf8               getSkillIds
  #66 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #67 = Utf8               <clinit>
  #68 = Utf8               SourceFile
  #69 = Utf8               GetPlayer.java
{
  public ext.mods.gameserver.handler.skillhandlers.GetPlayer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/GetPlayer;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=10, args_size=5
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
         4: ifeq          8
         7: return
         8: aload_3
         9: astore        5
        11: aload         5
        13: arraylength
        14: istore        6
        16: iconst_0
        17: istore        7
        19: iload         7
        21: iload         6
        23: if_icmpge     72
        26: aload         5
        28: iload         7
        30: aaload
        31: astore        8
        33: aload         8
        35: invokevirtual #13                 // Method ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        38: astore        9
        40: aload         9
        42: ifnull        66
        45: aload         9
        47: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
        50: ifeq          56
        53: goto          66
        56: aload         9
        58: aload_1
        59: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        62: iconst_0
        63: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Player.instantTeleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        66: iinc          7, 1
        69: goto          19
        72: return
      LineNumberTable:
        line 38: 0
        line 39: 7
        line 41: 8
        line 43: 33
        line 44: 40
        line 45: 53
        line 47: 56
        line 41: 66
        line 49: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      26     9 victim   Lext/mods/gameserver/model/actor/Player;
           33      33     8 target   Lext/mods/gameserver/model/WorldObject;
            0      73     0  this   Lext/mods/gameserver/handler/skillhandlers/GetPlayer;
            0      73     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      73     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0      73     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0      73     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #30                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/GetPlayer;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #36                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #38                 // Field ext/mods/gameserver/enums/skills/SkillType.GET_PLAYER:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #30                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "GetPlayer.java"
