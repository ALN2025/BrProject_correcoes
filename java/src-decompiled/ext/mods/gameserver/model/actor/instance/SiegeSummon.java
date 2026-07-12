// Bytecode for: ext.mods.gameserver.model.actor.instance.SiegeSummon
// File: ext\mods\gameserver\model\actor\instance\SiegeSummon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/SiegeSummon.class
  Last modified 9 de jul de 2026; size 1709 bytes
  MD5 checksum 7827db4b03d3016010166ce563e8b926
  Compiled from "SiegeSummon.java"
public class ext.mods.gameserver.model.actor.instance.SiegeSummon extends ext.mods.gameserver.model.actor.instance.Servitor
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/model/actor/instance/SiegeSummon
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Servitor
  interfaces: 0, fields: 3, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Servitor."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Servitor
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #7 = Methodref          #2.#8          // ext/mods/gameserver/model/actor/instance/Servitor.onSpawn:()V
   #8 = NameAndType        #9:#10         // onSpawn:()V
   #9 = Utf8               onSpawn
  #10 = Utf8               ()V
  #11 = Fieldref           #12.#13        // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #12 = Class              #14            // ext/mods/gameserver/enums/ZoneId
  #13 = NameAndType        #15:#16        // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #14 = Utf8               ext/mods/gameserver/enums/ZoneId
  #15 = Utf8               SIEGE
  #16 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #17 = Methodref          #18.#19        // ext/mods/gameserver/model/actor/instance/SiegeSummon.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #18 = Class              #20            // ext/mods/gameserver/model/actor/instance/SiegeSummon
  #19 = NameAndType        #21:#22        // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #20 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeSummon
  #21 = Utf8               isInsideZone
  #22 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #23 = Methodref          #18.#24        // ext/mods/gameserver/model/actor/instance/SiegeSummon.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #24 = NameAndType        #25:#26        // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #25 = Utf8               getOwner
  #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #27 = Methodref          #18.#28        // ext/mods/gameserver/model/actor/instance/SiegeSummon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #28 = NameAndType        #29:#30        // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #29 = Utf8               unSummon
  #30 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #31 = Fieldref           #32.#33        // ext/mods/gameserver/network/SystemMessageId.YOUR_SERVITOR_HAS_VANISHED:Lext/mods/gameserver/network/SystemMessageId;
  #32 = Class              #34            // ext/mods/gameserver/network/SystemMessageId
  #33 = NameAndType        #35:#36        // YOUR_SERVITOR_HAS_VANISHED:Lext/mods/gameserver/network/SystemMessageId;
  #34 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #35 = Utf8               YOUR_SERVITOR_HAS_VANISHED
  #36 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #37 = Methodref          #38.#39        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #38 = Class              #40            // ext/mods/gameserver/model/actor/Player
  #39 = NameAndType        #41:#42        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #40 = Utf8               ext/mods/gameserver/model/actor/Player
  #41 = Utf8               sendPacket
  #42 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #43 = Methodref          #2.#44         // ext/mods/gameserver/model/actor/instance/Servitor.onTeleported:()V
  #44 = NameAndType        #45:#10        // onTeleported:()V
  #45 = Utf8               onTeleported
  #46 = Utf8               SIEGE_GOLEM_ID
  #47 = Utf8               I
  #48 = Utf8               ConstantValue
  #49 = Integer            14737
  #50 = Utf8               HOG_CANNON_ID
  #51 = Integer            14768
  #52 = Utf8               SWOOP_CANNON_ID
  #53 = Integer            14839
  #54 = Utf8               Code
  #55 = Utf8               LineNumberTable
  #56 = Utf8               LocalVariableTable
  #57 = Utf8               this
  #58 = Utf8               Lext/mods/gameserver/model/actor/instance/SiegeSummon;
  #59 = Utf8               objectId
  #60 = Utf8               template
  #61 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #62 = Utf8               owner
  #63 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #64 = Utf8               skill
  #65 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #66 = Utf8               StackMapTable
  #67 = Utf8               SourceFile
  #68 = Utf8               SiegeSummon.java
{
  public static final int SIEGE_GOLEM_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 14737

  public static final int HOG_CANNON_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 14768

  public static final int SWOOP_CANNON_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 14839

  public ext.mods.gameserver.model.actor.instance.SiegeSummon(int, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.skills.L2Skill);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: aload_2
         3: aload_3
         4: aload         4
         6: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Servitor."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
         9: return
      LineNumberTable:
        line 34: 0
        line 35: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/SiegeSummon;
            0      10     1 objectId   I
            0      10     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      10     3 owner   Lext/mods/gameserver/model/actor/Player;
            0      10     4 skill   Lext/mods/gameserver/skills/L2Skill;

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #7                  // Method ext/mods/gameserver/model/actor/instance/Servitor.onSpawn:()V
         4: aload_0
         5: getstatic     #11                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
         8: invokevirtual #17                 // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        11: ifne          32
        14: aload_0
        15: aload_0
        16: invokevirtual #23                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        19: invokevirtual #27                 // Method unSummon:(Lext/mods/gameserver/model/actor/Player;)V
        22: aload_0
        23: invokevirtual #23                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        26: getstatic     #31                 // Field ext/mods/gameserver/network/SystemMessageId.YOUR_SERVITOR_HAS_VANISHED:Lext/mods/gameserver/network/SystemMessageId;
        29: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        32: return
      LineNumberTable:
        line 40: 0
        line 42: 4
        line 44: 14
        line 45: 22
        line 47: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/instance/SiegeSummon;
      StackMapTable: number_of_entries = 1
        frame_type = 32 /* same */

  public void onTeleported();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #11                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
         4: invokevirtual #17                 // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
         7: ifne          29
        10: aload_0
        11: aload_0
        12: invokevirtual #23                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #27                 // Method unSummon:(Lext/mods/gameserver/model/actor/Player;)V
        18: aload_0
        19: invokevirtual #23                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        22: getstatic     #31                 // Field ext/mods/gameserver/network/SystemMessageId.YOUR_SERVITOR_HAS_VANISHED:Lext/mods/gameserver/network/SystemMessageId;
        25: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        28: return
        29: aload_0
        30: invokespecial #43                 // Method ext/mods/gameserver/model/actor/instance/Servitor.onTeleported:()V
        33: return
      LineNumberTable:
        line 52: 0
        line 54: 10
        line 55: 18
        line 56: 28
        line 59: 29
        line 60: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/instance/SiegeSummon;
      StackMapTable: number_of_entries = 1
        frame_type = 29 /* same */
}
SourceFile: "SiegeSummon.java"
