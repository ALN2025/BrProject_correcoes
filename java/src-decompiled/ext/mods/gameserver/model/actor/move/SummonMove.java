// Bytecode for: ext.mods.gameserver.model.actor.move.SummonMove
// File: ext\mods\gameserver\model\actor\move\SummonMove.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/SummonMove.class
  Last modified 9 de jul de 2026; size 2797 bytes
  MD5 checksum 1a2f4c234e9defc33fc81a8a3901288c
  Compiled from "SummonMove.kt"
public final class ext.mods.gameserver.model.actor.move.SummonMove extends ext.mods.gameserver.model.actor.move.CreatureMove<ext.mods.gameserver.model.actor.Summon>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/model/actor/move/SummonMove
  super_class: #5                         // ext/mods/gameserver/model/actor/move/CreatureMove
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/model/actor/move/SummonMove
    #2 = Class              #1            // ext/mods/gameserver/model/actor/move/SummonMove
    #3 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove<Lext/mods/gameserver/model/actor/Summon;>;
    #4 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
    #5 = Class              #4            // ext/mods/gameserver/model/actor/move/CreatureMove
    #6 = Utf8               <init>
    #7 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               ext/mods/gameserver/model/actor/Creature
   #10 = Class              #9            // ext/mods/gameserver/model/actor/Creature
   #11 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #12 = NameAndType        #6:#11        // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #13 = Methodref          #5.#12        // ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #14 = Utf8               this
   #15 = Utf8               Lext/mods/gameserver/model/actor/move/SummonMove;
   #16 = Utf8               actor
   #17 = Utf8               Lext/mods/gameserver/model/actor/Summon;
   #18 = Utf8               moveToLocation
   #19 = Utf8               (Lext/mods/gameserver/model/location/Location;Z)V
   #20 = Utf8               ext/mods/Config
   #21 = Class              #20           // ext/mods/Config
   #22 = Utf8               SISTEMA_PATHFINDING
   #23 = Utf8               Z
   #24 = NameAndType        #22:#23       // SISTEMA_PATHFINDING:Z
   #25 = Fieldref           #21.#24       // ext/mods/Config.SISTEMA_PATHFINDING:Z
   #26 = NameAndType        #18:#19       // moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
   #27 = Methodref          #5.#26        // ext/mods/gameserver/model/actor/move/CreatureMove.moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
   #28 = Utf8               destination
   #29 = Utf8               Lext/mods/gameserver/model/location/Location;
   #30 = Utf8               pathfinding
   #31 = Utf8               ext/mods/gameserver/model/location/Location
   #32 = Class              #31           // ext/mods/gameserver/model/location/Location
   #33 = Utf8               shouldStopMovementTask
   #34 = Utf8               ()Z
   #35 = Utf8               avoidAttack
   #36 = Utf8               _actor
   #37 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #38 = NameAndType        #36:#37       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #39 = Fieldref           #2.#38        // ext/mods/gameserver/model/actor/move/SummonMove._actor:Lext/mods/gameserver/model/actor/Creature;
   #40 = Utf8               ext/mods/gameserver/model/actor/Summon
   #41 = Class              #40           // ext/mods/gameserver/model/actor/Summon
   #42 = Utf8               getOwner
   #43 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #44 = NameAndType        #42:#43       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #45 = Methodref          #41.#44       // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #46 = Utf8               getAttack
   #47 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #48 = NameAndType        #46:#47       // getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #49 = Methodref          #41.#48       // ext/mods/gameserver/model/actor/Summon.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #50 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
   #51 = Class              #50           // ext/mods/gameserver/model/actor/attack/CreatureAttack
   #52 = Utf8               isAttackingNow
   #53 = NameAndType        #52:#34       // isAttackingNow:()Z
   #54 = Methodref          #51.#53       // ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
   #55 = Utf8               getCast
   #56 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #57 = NameAndType        #55:#56       // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #58 = Methodref          #41.#57       // ext/mods/gameserver/model/actor/Summon.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #59 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
   #60 = Class              #59           // ext/mods/gameserver/model/actor/cast/CreatureCast
   #61 = Utf8               isCastingNow
   #62 = NameAndType        #61:#34       // isCastingNow:()Z
   #63 = Methodref          #60.#62       // ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
   #64 = Utf8               isMoving
   #65 = NameAndType        #64:#34       // isMoving:()Z
   #66 = Methodref          #41.#65       // ext/mods/gameserver/model/actor/Summon.isMoving:()Z
   #67 = Utf8               ext/mods/gameserver/model/WorldObject
   #68 = Class              #67           // ext/mods/gameserver/model/WorldObject
   #69 = Utf8               isIn2DRadius
   #70 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #71 = NameAndType        #69:#70       // isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #72 = Methodref          #41.#71       // ext/mods/gameserver/model/actor/Summon.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #73 = Utf8               ext/mods/gameserver/model/actor/Player
   #74 = Class              #73           // ext/mods/gameserver/model/actor/Player
   #75 = Utf8               getX
   #76 = Utf8               ()I
   #77 = NameAndType        #75:#76       // getX:()I
   #78 = Methodref          #74.#77       // ext/mods/gameserver/model/actor/Player.getX:()I
   #79 = Utf8               getY
   #80 = NameAndType        #79:#76       // getY:()I
   #81 = Methodref          #74.#80       // ext/mods/gameserver/model/actor/Player.getY:()I
   #82 = Utf8               getZ
   #83 = NameAndType        #82:#76       // getZ:()I
   #84 = Methodref          #74.#83       // ext/mods/gameserver/model/actor/Player.getZ:()I
   #85 = Utf8               (III)V
   #86 = NameAndType        #6:#85        // "<init>":(III)V
   #87 = Methodref          #32.#86       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #88 = Methodref          #2.#26        // ext/mods/gameserver/model/actor/move/SummonMove.moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
   #89 = Utf8               dest
   #90 = Utf8               owner
   #91 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #92 = Utf8               attacker
   #93 = Utf8               Lkotlin/Metadata;
   #94 = Utf8               mv
   #95 = Integer            2
   #96 = Integer            3
   #97 = Integer            0
   #98 = Utf8               k
   #99 = Integer            1
  #100 = Utf8               xi
  #101 = Integer            48
  #102 = Utf8               d1
  #103 = Utf8               \u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010
  #104 = Utf8               d2
  #105 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
  #106 = Utf8
  #107 = Utf8               Brproject
  #108 = Utf8               SummonMove.kt
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               RuntimeInvisibleParameterAnnotations
  #113 = Utf8               StackMapTable
  #114 = Utf8               Signature
  #115 = Utf8               SourceFile
  #116 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.model.actor.move.SummonMove(ext.mods.gameserver.model.actor.Summon);
    descriptor: (Lext/mods/gameserver/model/actor/Summon;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #10                 // class ext/mods/gameserver/model/actor/Creature
         5: invokespecial #13                 // Method ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         8: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/move/SummonMove;
            0       9     1 actor   Lext/mods/gameserver/model/actor/Summon;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  protected void moveToLocation(ext.mods.gameserver.model.location.Location, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Location;Z)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: ifeq          16
         6: getstatic     #25                 // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
         9: ifeq          16
        12: iconst_1
        13: goto          17
        16: iconst_0
        17: invokespecial #27                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
        20: return
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/move/SummonMove, class ext/mods/gameserver/model/location/Location, int ]
          stack = [ class ext/mods/gameserver/model/actor/move/SummonMove, class ext/mods/gameserver/model/location/Location ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/move/SummonMove, class ext/mods/gameserver/model/location/Location, int ]
          stack = [ class ext/mods/gameserver/model/actor/move/SummonMove, class ext/mods/gameserver/model/location/Location, int ]
      LineNumberTable:
        line 31: 0
        line 32: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/move/SummonMove;
            0      21     1 destination   Lext/mods/gameserver/model/location/Location;
            0      21     2 pathfinding   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public boolean shouldStopMovementTask();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/move/SummonMove;

  public void avoidAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #41                 // class ext/mods/gameserver/model/actor/Summon
         7: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        10: dup
        11: ifnonnull     16
        14: pop
        15: return
        16: astore_2
        17: aload_0
        18: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: checkcast     #41                 // class ext/mods/gameserver/model/actor/Summon
        24: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Summon.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        27: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        30: ifne          108
        33: aload_0
        34: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        37: checkcast     #41                 // class ext/mods/gameserver/model/actor/Summon
        40: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Summon.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        43: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        46: ifne          108
        49: aload_0
        50: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        53: checkcast     #41                 // class ext/mods/gameserver/model/actor/Summon
        56: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Summon.isMoving:()Z
        59: ifne          108
        62: aload_0
        63: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        66: checkcast     #41                 // class ext/mods/gameserver/model/actor/Summon
        69: aload_2
        70: checkcast     #68                 // class ext/mods/gameserver/model/WorldObject
        73: sipush        150
        76: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Summon.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        79: ifne          108
        82: new           #32                 // class ext/mods/gameserver/model/location/Location
        85: dup
        86: aload_2
        87: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
        90: aload_2
        91: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
        94: aload_2
        95: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        98: invokespecial #87                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       101: astore_3
       102: aload_0
       103: aload_3
       104: iconst_1
       105: invokevirtual #88                 // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       108: return
      StackMapTable: number_of_entries = 2
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 91
          locals = [ class ext/mods/gameserver/model/actor/Player ]
      LineNumberTable:
        line 38: 0
        line 40: 17
        line 41: 33
        line 42: 49
        line 44: 62
        line 45: 82
        line 46: 102
        line 49: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          102       6     3  dest   Lext/mods/gameserver/model/location/Location;
           17      92     2 owner   Lext/mods/gameserver/model/actor/Player;
            0     109     0  this   Lext/mods/gameserver/model/actor/move/SummonMove;
            0     109     1 attacker   Lext/mods/gameserver/model/actor/Creature;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
}
Signature: #3                           // Lext/mods/gameserver/model/actor/move/CreatureMove<Lext/mods/gameserver/model/actor/Summon;>;
SourceFile: "SummonMove.kt"
RuntimeVisibleAnnotations:
  0: #93(#94=[I#95,I#96,I#97],#98=I#99,#100=I#101,#102=[s#103],#104=[s#15,s#105,s#17,s#16,s#6,s#7,s#18,s#106,s#28,s#29,s#30,s#106,s#33,s#35,s#92,s#37,s#107])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"]
      d2=["Lext/mods/gameserver/model/actor/move/SummonMove;","Lext/mods/gameserver/model/actor/move/CreatureMove;","Lext/mods/gameserver/model/actor/Summon;","actor","<init>","(Lext/mods/gameserver/model/actor/Summon;)V","moveToLocation","","destination","Lext/mods/gameserver/model/location/Location;","pathfinding","","shouldStopMovementTask","avoidAttack","attacker","Lext/mods/gameserver/model/actor/Creature;","Brproject"]
    )
