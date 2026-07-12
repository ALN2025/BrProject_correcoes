// Bytecode for: ext.mods.gameserver.model.actor.instance.MutedFolk
// File: ext\mods\gameserver\model\actor\instance\MutedFolk.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/MutedFolk.class
  Last modified 9 de jul de 2026; size 705 bytes
  MD5 checksum 9fa1fbb26a39b853a2722f907942a523
  Compiled from "MutedFolk.java"
public final class ext.mods.gameserver.model.actor.instance.MutedFolk extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/model/actor/instance/MutedFolk
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Folk
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/instance/MutedFolk
   #8 = Utf8               ext/mods/gameserver/model/actor/instance/MutedFolk
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lext/mods/gameserver/model/actor/instance/MutedFolk;
  #14 = Utf8               objectId
  #15 = Utf8               I
  #16 = Utf8               template
  #17 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #18 = Utf8               onInteract
  #19 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #20 = Utf8               player
  #21 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #22 = Utf8               SourceFile
  #23 = Utf8               MutedFolk.java
{
  public ext.mods.gameserver.model.actor.instance.MutedFolk(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 30: 0
        line 31: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/MutedFolk;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/MutedFolk;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;
}
SourceFile: "MutedFolk.java"
