// Bytecode for: ext.mods.gameserver.model.actor.attack.CreatureAttack$HitHolder
// File: ext\mods\gameserver\model\actor\attack\CreatureAttack$HitHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder.class
  Last modified 9 de jul de 2026; size 1098 bytes
  MD5 checksum 5fa2b566018ac48545b690d8c8673b28
  Compiled from "CreatureAttack.java"
public class ext.mods.gameserver.model.actor.attack.CreatureAttack$HitHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._target:Lext/mods/gameserver/model/actor/Creature;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder
   #9 = NameAndType        #11:#12        // _target:Lext/mods/gameserver/model/actor/Creature;
  #10 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder
  #11 = Utf8               _target
  #12 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Creature
  #15 = NameAndType        #17:#18        // getObjectId:()I
  #16 = Utf8               ext/mods/gameserver/model/actor/Creature
  #17 = Utf8               getObjectId
  #18 = Utf8               ()I
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._targetId:I
  #20 = NameAndType        #21:#22        // _targetId:I
  #21 = Utf8               _targetId
  #22 = Utf8               I
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._damage:I
  #24 = NameAndType        #25:#22        // _damage:I
  #25 = Utf8               _damage
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._crit:Z
  #27 = NameAndType        #28:#29        // _crit:Z
  #28 = Utf8               _crit
  #29 = Utf8               Z
  #30 = Fieldref           #8.#31         // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._sDef:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #31 = NameAndType        #32:#33        // _sDef:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #32 = Utf8               _sDef
  #33 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #34 = Fieldref           #8.#35         // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._miss:Z
  #35 = NameAndType        #36:#29        // _miss:Z
  #36 = Utf8               _miss
  #37 = Utf8               _flags
  #38 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZLext/mods/gameserver/enums/skills/ShieldDefense;)V
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #44 = Utf8               target
  #45 = Utf8               damage
  #46 = Utf8               crit
  #47 = Utf8               miss
  #48 = Utf8               sDef
  #49 = Utf8               SourceFile
  #50 = Utf8               CreatureAttack.java
  #51 = Utf8               NestHost
  #52 = Class              #53            // ext/mods/gameserver/model/actor/attack/CreatureAttack
  #53 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
  #54 = Utf8               InnerClasses
  #55 = Utf8               HitHolder
{
  public ext.mods.gameserver.model.actor.Creature _target;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public int _targetId;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _damage;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public boolean _crit;
    descriptor: Z
    flags: (0x0001) ACC_PUBLIC

  public boolean _miss;
    descriptor: Z
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.enums.skills.ShieldDefense _sDef;
    descriptor: Lext/mods/gameserver/enums/skills/ShieldDefense;
    flags: (0x0001) ACC_PUBLIC

  public int _flags;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.attack.CreatureAttack$HitHolder(ext.mods.gameserver.model.actor.Creature, int, boolean, boolean, ext.mods.gameserver.enums.skills.ShieldDefense);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IZZLext/mods/gameserver/enums/skills/ShieldDefense;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _target:Lext/mods/gameserver/model/actor/Creature;
         9: aload_0
        10: aload_1
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        14: putfield      #19                 // Field _targetId:I
        17: aload_0
        18: iload_2
        19: putfield      #23                 // Field _damage:I
        22: aload_0
        23: iload_3
        24: putfield      #26                 // Field _crit:Z
        27: aload_0
        28: aload         5
        30: putfield      #30                 // Field _sDef:Lext/mods/gameserver/enums/skills/ShieldDefense;
        33: aload_0
        34: iload         4
        36: putfield      #34                 // Field _miss:Z
        39: return
      LineNumberTable:
        line 453: 0
        line 454: 4
        line 455: 9
        line 456: 17
        line 457: 22
        line 458: 27
        line 459: 33
        line 460: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
            0      40     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      40     2 damage   I
            0      40     3  crit   Z
            0      40     4  miss   Z
            0      40     5  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
}
SourceFile: "CreatureAttack.java"
NestHost: class ext/mods/gameserver/model/actor/attack/CreatureAttack
InnerClasses:
  public static #55= #8 of #52;           // HitHolder=class ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder of class ext/mods/gameserver/model/actor/attack/CreatureAttack
