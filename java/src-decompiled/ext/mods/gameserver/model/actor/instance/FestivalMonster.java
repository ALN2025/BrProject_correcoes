// Bytecode for: ext.mods.gameserver.model.actor.instance.FestivalMonster
// File: ext\mods\gameserver\model\actor\instance\FestivalMonster.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/FestivalMonster.class
  Last modified 9 de jul de 2026; size 1180 bytes
  MD5 checksum 884adaff341e19a6fbd5f5570eb66884
  Compiled from "FestivalMonster.java"
public class ext.mods.gameserver.model.actor.instance.FestivalMonster extends ext.mods.gameserver.model.actor.instance.Monster
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/FestivalMonster
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Monster
  interfaces: 0, fields: 1, methods: 3, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Monster
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/instance/FestivalMonster._minions:Ljava/util/Set;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/instance/FestivalMonster
   #9 = NameAndType        #11:#12        // _minions:Ljava/util/Set;
  #10 = Utf8               ext/mods/gameserver/model/actor/instance/FestivalMonster
  #11 = Utf8               _minions
  #12 = Utf8               Ljava/util/Set;
  #13 = Methodref          #14.#15        // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #14 = Class              #16            // java/util/concurrent/ConcurrentHashMap
  #15 = NameAndType        #17:#18        // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #16 = Utf8               java/util/concurrent/ConcurrentHashMap
  #17 = Utf8               newKeySet
  #18 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #19 = Utf8               Signature
  #20 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/actor/instance/FestivalMonster;
  #26 = Utf8               objectId
  #27 = Utf8               I
  #28 = Utf8               template
  #29 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #30 = Utf8               isAggressive
  #31 = Utf8               ()Z
  #32 = Utf8               getMinions
  #33 = Utf8               ()Ljava/util/Set;
  #34 = Utf8               StackMapTable
  #35 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
  #36 = Utf8               SourceFile
  #37 = Utf8               FestivalMonster.java
  #38 = Utf8               InnerClasses
  #39 = Class              #40            // java/util/concurrent/ConcurrentHashMap$KeySetView
  #40 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #41 = Utf8               KeySetView
{
  public ext.mods.gameserver.model.actor.instance.FestivalMonster(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 35: 0
        line 36: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/FestivalMonster;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isAggressive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/FestivalMonster;

  public java.util.Set<ext.mods.gameserver.model.actor.Npc> getMinions();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _minions:Ljava/util/Set;
         4: ifnonnull     14
         7: aload_0
         8: invokestatic  #13                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        11: putfield      #7                  // Field _minions:Ljava/util/Set;
        14: aload_0
        15: getfield      #7                  // Field _minions:Ljava/util/Set;
        18: areturn
      LineNumberTable:
        line 47: 0
        line 48: 7
        line 50: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/instance/FestivalMonster;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */
    Signature: #35                          // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
}
SourceFile: "FestivalMonster.java"
InnerClasses:
  public static final #41= #39 of #14;    // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
