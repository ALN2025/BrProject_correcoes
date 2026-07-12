// Bytecode for: ext.mods.gameserver.model.actor.instance.Fence$L2DummyFence
// File: ext\mods\gameserver\model\actor\instance\Fence$L2DummyFence.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence.class
  Last modified 9 de jul de 2026; size 1493 bytes
  MD5 checksum eafd423ff294d5a42f94dd092e0539df
  Compiled from "Fence.java"
public class ext.mods.gameserver.model.actor.instance.Fence$L2DummyFence extends ext.mods.gameserver.model.WorldObject
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #24                         // ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence
  super_class: #18                        // ext/mods/gameserver/model/WorldObject
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Methodref          #8.#9          // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #8 = Class              #10            // ext/mods/gameserver/idfactory/IdFactory
   #9 = NameAndType        #11:#12        // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #10 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #11 = Utf8               getInstance
  #12 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #13 = Methodref          #8.#14         // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #14 = NameAndType        #15:#16        // getNextId:()I
  #15 = Utf8               getNextId
  #16 = Utf8               ()I
  #17 = Methodref          #18.#19        // ext/mods/gameserver/model/WorldObject."<init>":(I)V
  #18 = Class              #20            // ext/mods/gameserver/model/WorldObject
  #19 = NameAndType        #21:#22        // "<init>":(I)V
  #20 = Utf8               ext/mods/gameserver/model/WorldObject
  #21 = Utf8               <init>
  #22 = Utf8               (I)V
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence._fence:Lext/mods/gameserver/model/actor/instance/Fence;
  #24 = Class              #26            // ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence
  #25 = NameAndType        #27:#28        // _fence:Lext/mods/gameserver/model/actor/instance/Fence;
  #26 = Utf8               ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence
  #27 = Utf8               _fence
  #28 = Utf8               Lext/mods/gameserver/model/actor/instance/Fence;
  #29 = Class              #30            // ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo
  #30 = Utf8               ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo
  #31 = Methodref          #24.#32        // ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence.getObjectId:()I
  #32 = NameAndType        #33:#16        // getObjectId:()I
  #33 = Utf8               getObjectId
  #34 = Methodref          #29.#35        // ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo."<init>":(ILext/mods/gameserver/model/actor/instance/Fence;)V
  #35 = NameAndType        #21:#36        // "<init>":(ILext/mods/gameserver/model/actor/instance/Fence;)V
  #36 = Utf8               (ILext/mods/gameserver/model/actor/instance/Fence;)V
  #37 = Methodref          #38.#39        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #38 = Class              #40            // ext/mods/gameserver/model/actor/Player
  #39 = NameAndType        #41:#42        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #40 = Utf8               ext/mods/gameserver/model/actor/Player
  #41 = Utf8               sendPacket
  #42 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #43 = Utf8               (Lext/mods/gameserver/model/actor/instance/Fence;Lext/mods/gameserver/model/actor/instance/Fence;)V
  #44 = Utf8               Code
  #45 = Utf8               LineNumberTable
  #46 = Utf8               LocalVariableTable
  #47 = Utf8               this
  #48 = Utf8               Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
  #49 = Utf8               this$0
  #50 = Utf8               fence
  #51 = Utf8               MethodParameters
  #52 = Utf8               sendInfo
  #53 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #54 = Utf8               player
  #55 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #56 = Utf8               SourceFile
  #57 = Utf8               Fence.java
  #58 = Utf8               NestHost
  #59 = Class              #60            // ext/mods/gameserver/model/actor/instance/Fence
  #60 = Utf8               ext/mods/gameserver/model/actor/instance/Fence
  #61 = Utf8               InnerClasses
  #62 = Utf8               L2DummyFence
{
  public ext.mods.gameserver.model.actor.instance.Fence$L2DummyFence(ext.mods.gameserver.model.actor.instance.Fence, ext.mods.gameserver.model.actor.instance.Fence);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Fence;Lext/mods/gameserver/model/actor/instance/Fence;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokestatic  #7                  // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        11: invokevirtual #13                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        14: invokespecial #17                 // Method ext/mods/gameserver/model/WorldObject."<init>":(I)V
        17: aload_0
        18: aload_2
        19: putfield      #23                 // Field _fence:Lext/mods/gameserver/model/actor/instance/Fence;
        22: return
      LineNumberTable:
        line 142: 0
        line 143: 7
        line 145: 17
        line 146: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
            0      23     1 this$0   Lext/mods/gameserver/model/actor/instance/Fence;
            0      23     2 fence   Lext/mods/gameserver/model/actor/instance/Fence;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: new           #29                 // class ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo
         4: dup
         5: aload_0
         6: invokevirtual #31                 // Method getObjectId:()I
         9: aload_0
        10: getfield      #23                 // Field _fence:Lext/mods/gameserver/model/actor/instance/Fence;
        13: invokespecial #34                 // Method ext/mods/gameserver/network/serverpackets/ExColosseumFenceInfo."<init>":(ILext/mods/gameserver/model/actor/instance/Fence;)V
        16: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        19: return
      LineNumberTable:
        line 151: 0
        line 152: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/instance/Fence$L2DummyFence;
            0      20     1 player   Lext/mods/gameserver/model/actor/Player;
}
SourceFile: "Fence.java"
NestHost: class ext/mods/gameserver/model/actor/instance/Fence
InnerClasses:
  protected #62= #24 of #59;              // L2DummyFence=class ext/mods/gameserver/model/actor/instance/Fence$L2DummyFence of class ext/mods/gameserver/model/actor/instance/Fence
