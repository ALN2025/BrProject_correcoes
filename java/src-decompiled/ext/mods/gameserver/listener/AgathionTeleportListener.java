// Bytecode for: ext.mods.gameserver.listener.AgathionTeleportListener
// File: ext\mods\gameserver\listener\AgathionTeleportListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/listener/AgathionTeleportListener.class
  Last modified 9 de jul de 2026; size 998 bytes
  MD5 checksum 322b7824ca7c26d4806e8cdd8620bb88
  Compiled from "AgathionTeleportListener.java"
public class ext.mods.gameserver.listener.AgathionTeleportListener implements ext.mods.extensions.listener.actor.player.OnTeleportListener
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/listener/AgathionTeleportListener
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Player
   #9 = NameAndType        #11:#12        // getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
  #10 = Utf8               ext/mods/gameserver/model/actor/Player
  #11 = Utf8               getCurrentAgation
  #12 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Agathion;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/instance/Agathion.forceFollowPlayer:()V
  #14 = Class              #16            // ext/mods/gameserver/model/actor/instance/Agathion
  #15 = NameAndType        #17:#6         // forceFollowPlayer:()V
  #16 = Utf8               ext/mods/gameserver/model/actor/instance/Agathion
  #17 = Utf8               forceFollowPlayer
  #18 = Class              #19            // ext/mods/gameserver/listener/AgathionTeleportListener
  #19 = Utf8               ext/mods/gameserver/listener/AgathionTeleportListener
  #20 = Class              #21            // ext/mods/extensions/listener/actor/player/OnTeleportListener
  #21 = Utf8               ext/mods/extensions/listener/actor/player/OnTeleportListener
  #22 = Utf8               Code
  #23 = Utf8               LineNumberTable
  #24 = Utf8               LocalVariableTable
  #25 = Utf8               this
  #26 = Utf8               Lext/mods/gameserver/listener/AgathionTeleportListener;
  #27 = Utf8               onTeleport
  #28 = Utf8               (Lext/mods/gameserver/model/actor/Player;III)V
  #29 = Utf8               player
  #30 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #31 = Utf8               x
  #32 = Utf8               I
  #33 = Utf8               y
  #34 = Utf8               z
  #35 = Utf8               agathion
  #36 = Utf8               Lext/mods/gameserver/model/actor/instance/Agathion;
  #37 = Utf8               StackMapTable
  #38 = Utf8               SourceFile
  #39 = Utf8               AgathionTeleportListener.java
{
  public ext.mods.gameserver.listener.AgathionTeleportListener();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/listener/AgathionTeleportListener;

  public void onTeleport(ext.mods.gameserver.model.actor.Player, int, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=6, args_size=5
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
         4: astore        5
         6: aload         5
         8: ifnull        16
        11: aload         5
        13: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/instance/Agathion.forceFollowPlayer:()V
        16: return
      LineNumberTable:
        line 32: 0
        line 33: 6
        line 35: 11
        line 37: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/listener/AgathionTeleportListener;
            0      17     1 player   Lext/mods/gameserver/model/actor/Player;
            0      17     2     x   I
            0      17     3     y   I
            0      17     4     z   I
            6      11     5 agathion   Lext/mods/gameserver/model/actor/instance/Agathion;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/instance/Agathion ]
}
SourceFile: "AgathionTeleportListener.java"
