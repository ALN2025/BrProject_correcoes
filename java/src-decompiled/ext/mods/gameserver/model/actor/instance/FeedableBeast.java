// Bytecode for: ext.mods.gameserver.model.actor.instance.FeedableBeast
// File: ext\mods\gameserver\model\actor\instance\FeedableBeast.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/FeedableBeast.class
  Last modified 9 de jul de 2026; size 542 bytes
  MD5 checksum 9ef5d413e454c2ed020f393ed29a1646
  Compiled from "FeedableBeast.java"
public class ext.mods.gameserver.model.actor.instance.FeedableBeast extends ext.mods.gameserver.model.actor.instance.Monster
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/model/actor/instance/FeedableBeast
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Monster
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Monster
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/instance/FeedableBeast
   #8 = Utf8               ext/mods/gameserver/model/actor/instance/FeedableBeast
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lext/mods/gameserver/model/actor/instance/FeedableBeast;
  #14 = Utf8               objectId
  #15 = Utf8               I
  #16 = Utf8               template
  #17 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #18 = Utf8               SourceFile
  #19 = Utf8               FeedableBeast.java
{
  public ext.mods.gameserver.model.actor.instance.FeedableBeast(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 32: 0
        line 33: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/FeedableBeast;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
}
SourceFile: "FeedableBeast.java"
