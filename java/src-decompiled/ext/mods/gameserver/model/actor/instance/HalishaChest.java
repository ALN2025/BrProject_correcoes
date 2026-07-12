// Bytecode for: ext.mods.gameserver.model.actor.instance.HalishaChest
// File: ext\mods\gameserver\model\actor\instance\HalishaChest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/HalishaChest.class
  Last modified 9 de jul de 2026; size 744 bytes
  MD5 checksum 07855085477415e32b4dc00b5043d835
  Compiled from "HalishaChest.java"
public final class ext.mods.gameserver.model.actor.instance.HalishaChest extends ext.mods.gameserver.model.actor.instance.Monster
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/HalishaChest
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Monster
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Monster
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/instance/HalishaChest.setNoRndWalk:(Z)V
   #8 = Class              #10            // ext/mods/gameserver/model/actor/instance/HalishaChest
   #9 = NameAndType        #11:#12        // setNoRndWalk:(Z)V
  #10 = Utf8               ext/mods/gameserver/model/actor/instance/HalishaChest
  #11 = Utf8               setNoRndWalk
  #12 = Utf8               (Z)V
  #13 = Methodref          #8.#14         // ext/mods/gameserver/model/actor/instance/HalishaChest.setShowSummonAnimation:(Z)V
  #14 = NameAndType        #15:#12        // setShowSummonAnimation:(Z)V
  #15 = Utf8               setShowSummonAnimation
  #16 = Methodref          #8.#17         // ext/mods/gameserver/model/actor/instance/HalishaChest.disableCoreAi:(Z)V
  #17 = NameAndType        #18:#12        // disableCoreAi:(Z)V
  #18 = Utf8               disableCoreAi
  #19 = Utf8               Code
  #20 = Utf8               LineNumberTable
  #21 = Utf8               LocalVariableTable
  #22 = Utf8               this
  #23 = Utf8               Lext/mods/gameserver/model/actor/instance/HalishaChest;
  #24 = Utf8               objectId
  #25 = Utf8               I
  #26 = Utf8               template
  #27 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #28 = Utf8               isMovementDisabled
  #29 = Utf8               ()Z
  #30 = Utf8               SourceFile
  #31 = Utf8               HalishaChest.java
{
  public ext.mods.gameserver.model.actor.instance.HalishaChest(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: iconst_1
         8: invokevirtual #7                  // Method setNoRndWalk:(Z)V
        11: aload_0
        12: iconst_1
        13: invokevirtual #13                 // Method setShowSummonAnimation:(Z)V
        16: aload_0
        17: iconst_1
        18: invokevirtual #16                 // Method disableCoreAi:(Z)V
        21: return
      LineNumberTable:
        line 26: 0
        line 28: 6
        line 29: 11
        line 30: 16
        line 31: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/instance/HalishaChest;
            0      22     1 objectId   I
            0      22     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isMovementDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/HalishaChest;
}
SourceFile: "HalishaChest.java"
