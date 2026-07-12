// Bytecode for: ext.mods.gameserver.model.actor.instance.VillageMasterMystic
// File: ext\mods\gameserver\model\actor\instance\VillageMasterMystic.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/VillageMasterMystic.class
  Last modified 9 de jul de 2026; size 1393 bytes
  MD5 checksum 8884e9b8eeabe5aa1ba070919f2b3f9e
  Compiled from "VillageMasterMystic.java"
public final class ext.mods.gameserver.model.actor.instance.VillageMasterMystic extends ext.mods.gameserver.model.actor.instance.VillageMaster
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #32                         // ext/mods/gameserver/model/actor/instance/VillageMasterMystic
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/VillageMaster
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/VillageMaster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/VillageMaster
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/VillageMaster
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/enums/actors/ClassId.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #8 = Class              #10            // ext/mods/gameserver/enums/actors/ClassId
   #9 = NameAndType        #11:#12        // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #10 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #11 = Utf8               getRace
  #12 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
  #14 = Class              #16            // ext/mods/gameserver/enums/actors/ClassRace
  #15 = NameAndType        #17:#18        // HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
  #16 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
  #17 = Utf8               HUMAN
  #18 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
  #19 = Fieldref           #14.#20        // ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
  #20 = NameAndType        #21:#18        // ELF:Lext/mods/gameserver/enums/actors/ClassRace;
  #21 = Utf8               ELF
  #22 = Methodref          #8.#23         // ext/mods/gameserver/enums/actors/ClassId.getType:()Lext/mods/gameserver/enums/actors/ClassType;
  #23 = NameAndType        #24:#25        // getType:()Lext/mods/gameserver/enums/actors/ClassType;
  #24 = Utf8               getType
  #25 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassType;
  #26 = Fieldref           #27.#28        // ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
  #27 = Class              #29            // ext/mods/gameserver/enums/actors/ClassType
  #28 = NameAndType        #30:#31        // MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
  #29 = Utf8               ext/mods/gameserver/enums/actors/ClassType
  #30 = Utf8               MYSTIC
  #31 = Utf8               Lext/mods/gameserver/enums/actors/ClassType;
  #32 = Class              #33            // ext/mods/gameserver/model/actor/instance/VillageMasterMystic
  #33 = Utf8               ext/mods/gameserver/model/actor/instance/VillageMasterMystic
  #34 = Utf8               Code
  #35 = Utf8               LineNumberTable
  #36 = Utf8               LocalVariableTable
  #37 = Utf8               this
  #38 = Utf8               Lext/mods/gameserver/model/actor/instance/VillageMasterMystic;
  #39 = Utf8               objectId
  #40 = Utf8               I
  #41 = Utf8               template
  #42 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #43 = Utf8               checkVillageMasterRace
  #44 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
  #45 = Utf8               pclass
  #46 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #47 = Utf8               StackMapTable
  #48 = Utf8               checkVillageMasterTeachType
  #49 = Utf8               SourceFile
  #50 = Utf8               VillageMasterMystic.java
{
  public ext.mods.gameserver.model.actor.instance.VillageMasterMystic(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/VillageMaster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 29: 0
        line 30: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/VillageMasterMystic;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  protected final boolean checkVillageMasterRace(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: invokevirtual #7                  // Method ext/mods/gameserver/enums/actors/ClassId.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        10: getstatic     #13                 // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
        13: if_acmpeq     26
        16: aload_1
        17: invokevirtual #7                  // Method ext/mods/gameserver/enums/actors/ClassId.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        20: getstatic     #19                 // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
        23: if_acmpne     30
        26: iconst_1
        27: goto          31
        30: iconst_0
        31: ireturn
      LineNumberTable:
        line 35: 0
        line 36: 4
        line 38: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/instance/VillageMasterMystic;
            0      32     1 pclass   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected final boolean checkVillageMasterTeachType(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: invokevirtual #22                 // Method ext/mods/gameserver/enums/actors/ClassId.getType:()Lext/mods/gameserver/enums/actors/ClassType;
        10: getstatic     #26                 // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
        13: if_acmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 44: 0
        line 45: 4
        line 47: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/instance/VillageMasterMystic;
            0      22     1 pclass   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "VillageMasterMystic.java"
