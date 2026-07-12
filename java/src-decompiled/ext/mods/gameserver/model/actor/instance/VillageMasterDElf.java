// Bytecode for: ext.mods.gameserver.model.actor.instance.VillageMasterDElf
// File: ext\mods\gameserver\model\actor\instance\VillageMasterDElf.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/VillageMasterDElf.class
  Last modified 9 de jul de 2026; size 1042 bytes
  MD5 checksum 2d341cd9f613bbad8d019928fc975793
  Compiled from "VillageMasterDElf.java"
public final class ext.mods.gameserver.model.actor.instance.VillageMasterDElf extends ext.mods.gameserver.model.actor.instance.VillageMaster
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #19                         // ext/mods/gameserver/model/actor/instance/VillageMasterDElf
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/VillageMaster
  interfaces: 0, fields: 0, methods: 2, attributes: 1
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
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
  #14 = Class              #16            // ext/mods/gameserver/enums/actors/ClassRace
  #15 = NameAndType        #17:#18        // DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
  #16 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
  #17 = Utf8               DARK_ELF
  #18 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
  #19 = Class              #20            // ext/mods/gameserver/model/actor/instance/VillageMasterDElf
  #20 = Utf8               ext/mods/gameserver/model/actor/instance/VillageMasterDElf
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/actor/instance/VillageMasterDElf;
  #26 = Utf8               objectId
  #27 = Utf8               I
  #28 = Utf8               template
  #29 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #30 = Utf8               checkVillageMasterRace
  #31 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
  #32 = Utf8               pclass
  #33 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #34 = Utf8               StackMapTable
  #35 = Utf8               SourceFile
  #36 = Utf8               VillageMasterDElf.java
{
  public ext.mods.gameserver.model.actor.instance.VillageMasterDElf(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 28: 0
        line 29: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/VillageMasterDElf;
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
        10: getstatic     #13                 // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
        13: if_acmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 34: 0
        line 35: 4
        line 37: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/instance/VillageMasterDElf;
            0      22     1 pclass   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "VillageMasterDElf.java"
