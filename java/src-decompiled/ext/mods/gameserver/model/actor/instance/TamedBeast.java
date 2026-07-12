// Bytecode for: ext.mods.gameserver.model.actor.instance.TamedBeast
// File: ext\mods\gameserver\model\actor\instance\TamedBeast.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/TamedBeast.class
  Last modified 9 de jul de 2026; size 2734 bytes
  MD5 checksum 1c9a3c0284bae7fa9f960d7ea15a8d30
  Compiled from "TamedBeast.java"
public final class ext.mods.gameserver.model.actor.instance.TamedBeast extends ext.mods.gameserver.model.actor.instance.FeedableBeast
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/TamedBeast
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/FeedableBeast
  interfaces: 0, fields: 2, methods: 10, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/FeedableBeast."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/FeedableBeast
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/FeedableBeast
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/instance/TamedBeast.disableCoreAi:(Z)V
   #8 = Class              #10            // ext/mods/gameserver/model/actor/instance/TamedBeast
   #9 = NameAndType        #11:#12        // disableCoreAi:(Z)V
  #10 = Utf8               ext/mods/gameserver/model/actor/instance/TamedBeast
  #11 = Utf8               disableCoreAi
  #12 = Utf8               (Z)V
  #13 = Methodref          #8.#14         // ext/mods/gameserver/model/actor/instance/TamedBeast.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #14 = NameAndType        #15:#16        // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #15 = Utf8               getStatus
  #16 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #17 = Methodref          #18.#19        // ext/mods/gameserver/model/actor/status/AttackableStatus.setMaxHpMp:()V
  #18 = Class              #20            // ext/mods/gameserver/model/actor/status/AttackableStatus
  #19 = NameAndType        #21:#22        // setMaxHpMp:()V
  #20 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #21 = Utf8               setMaxHpMp
  #22 = Utf8               ()V
  #23 = Methodref          #24.#25        // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #24 = Class              #26            // ext/mods/gameserver/model/actor/Player
  #25 = NameAndType        #27:#28        // getName:()Ljava/lang/String;
  #26 = Utf8               ext/mods/gameserver/model/actor/Player
  #27 = Utf8               getName
  #28 = Utf8               ()Ljava/lang/String;
  #29 = Methodref          #8.#30         // ext/mods/gameserver/model/actor/instance/TamedBeast.setTitle:(Ljava/lang/String;)V
  #30 = NameAndType        #31:#32        // setTitle:(Ljava/lang/String;)V
  #31 = Utf8               setTitle
  #32 = Utf8               (Ljava/lang/String;)V
  #33 = Fieldref           #8.#34         // ext/mods/gameserver/model/actor/instance/TamedBeast._owner:Lext/mods/gameserver/model/actor/Player;
  #34 = NameAndType        #35:#36        // _owner:Lext/mods/gameserver/model/actor/Player;
  #35 = Utf8               _owner
  #36 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #37 = Methodref          #24.#38        // ext/mods/gameserver/model/actor/Player.setTamedBeast:(Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
  #38 = NameAndType        #39:#40        // setTamedBeast:(Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
  #39 = Utf8               setTamedBeast
  #40 = Utf8               (Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
  #41 = Fieldref           #8.#42         // ext/mods/gameserver/model/actor/instance/TamedBeast._foodId:I
  #42 = NameAndType        #43:#44        // _foodId:I
  #43 = Utf8               _foodId
  #44 = Utf8               I
  #45 = Methodref          #8.#46         // ext/mods/gameserver/model/actor/instance/TamedBeast.spawnMe:(Lext/mods/gameserver/model/location/Location;)V
  #46 = NameAndType        #47:#48        // spawnMe:(Lext/mods/gameserver/model/location/Location;)V
  #47 = Utf8               spawnMe
  #48 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #49 = Methodref          #2.#50         // ext/mods/gameserver/model/actor/instance/FeedableBeast.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #50 = NameAndType        #51:#52        // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #51 = Utf8               doDie
  #52 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #53 = Methodref          #2.#54         // ext/mods/gameserver/model/actor/instance/FeedableBeast.deleteMe:()V
  #54 = NameAndType        #55:#22        // deleteMe:()V
  #55 = Utf8               deleteMe
  #56 = Fieldref           #8.#57         // ext/mods/gameserver/model/actor/instance/TamedBeast._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #57 = NameAndType        #58:#59        // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #58 = Utf8               _ai
  #59 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #60 = Class              #61            // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
  #61 = Utf8               ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
  #62 = Methodref          #60.#63        // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI."<init>":(Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
  #63 = NameAndType        #5:#40         // "<init>":(Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
  #64 = Methodref          #8.#65         // ext/mods/gameserver/model/actor/instance/TamedBeast.getAI:()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
  #65 = NameAndType        #66:#67        // getAI:()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
  #66 = Utf8               getAI
  #67 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
  #68 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/location/Location;)V
  #69 = Utf8               Code
  #70 = Utf8               LineNumberTable
  #71 = Utf8               LocalVariableTable
  #72 = Utf8               this
  #73 = Utf8               Lext/mods/gameserver/model/actor/instance/TamedBeast;
  #74 = Utf8               objectId
  #75 = Utf8               template
  #76 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #77 = Utf8               owner
  #78 = Utf8               foodId
  #79 = Utf8               loc
  #80 = Utf8               Lext/mods/gameserver/model/location/Location;
  #81 = Utf8               killer
  #82 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #83 = Utf8               StackMapTable
  #84 = Utf8               setAI
  #85 = Utf8               getFoodId
  #86 = Utf8               ()I
  #87 = Utf8               getOwner
  #88 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #89 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #90 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #91 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #92 = Utf8               SourceFile
  #93 = Utf8               TamedBeast.java
{
  protected int _foodId;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.Player _owner;
    descriptor: Lext/mods/gameserver/model/actor/Player;
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.actor.instance.TamedBeast(int, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Player, int, ext.mods.gameserver.model.location.Location);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=6
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/FeedableBeast."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: iconst_1
         8: invokevirtual #7                  // Method disableCoreAi:(Z)V
        11: aload_0
        12: invokevirtual #13                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        15: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.setMaxHpMp:()V
        18: aload_0
        19: aload_3
        20: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        23: invokevirtual #29                 // Method setTitle:(Ljava/lang/String;)V
        26: aload_0
        27: aload_3
        28: putfield      #33                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        31: aload_0
        32: getfield      #33                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        35: aload_0
        36: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.setTamedBeast:(Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
        39: aload_0
        40: iload         4
        42: putfield      #41                 // Field _foodId:I
        45: aload_0
        46: aload         5
        48: invokevirtual #45                 // Method spawnMe:(Lext/mods/gameserver/model/location/Location;)V
        51: return
      LineNumberTable:
        line 43: 0
        line 45: 6
        line 46: 11
        line 47: 18
        line 49: 26
        line 50: 31
        line 52: 39
        line 54: 45
        line 55: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;
            0      52     1 objectId   I
            0      52     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      52     3 owner   Lext/mods/gameserver/model/actor/Player;
            0      52     4 foodId   I
            0      52     5   loc   Lext/mods/gameserver/model/location/Location;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #49                 // Method ext/mods/gameserver/model/actor/instance/FeedableBeast.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: getfield      #33                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        14: ifnull        25
        17: aload_0
        18: getfield      #33                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        21: aconst_null
        22: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.setTamedBeast:(Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
        25: iconst_1
        26: ireturn
      LineNumberTable:
        line 60: 0
        line 61: 8
        line 63: 10
        line 64: 17
        line 66: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;
            0      27     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 10 /* same */
        frame_type = 14 /* same */

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        15
         7: aload_0
         8: getfield      #33                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: aconst_null
        12: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.setTamedBeast:(Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
        15: aload_0
        16: invokespecial #53                 // Method ext/mods/gameserver/model/actor/instance/FeedableBeast.deleteMe:()V
        19: return
      LineNumberTable:
        line 72: 0
        line 73: 7
        line 75: 15
        line 76: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public ext.mods.gameserver.model.actor.ai.type.TamedBeastAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #60                 // class ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
         7: areturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #60                 // class ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
         4: dup
         5: aload_0
         6: invokespecial #62                 // Method ext/mods/gameserver/model/actor/ai/type/TamedBeastAI."<init>":(Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
         9: putfield      #56                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 87: 0
        line 88: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;

  public int getFoodId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _foodId:I
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;

  public ext.mods.gameserver.model.actor.ai.type.AttackableAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #64                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
         4: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;

  public ext.mods.gameserver.model.actor.ai.type.NpcAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #64                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
         4: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #64                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
         4: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/TamedBeast;
}
SourceFile: "TamedBeast.java"
