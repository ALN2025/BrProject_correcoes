// Bytecode for: ext.mods.gameserver.geoengine.PeaceZoneCollisionManager
// File: ext\mods\gameserver\geoengine\PeaceZoneCollisionManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.class
  Last modified 9 de jul de 2026; size 3126 bytes
  MD5 checksum 4fba606ab38990252dfb04978af6cdc6
  Compiled from "PeaceZoneCollisionManager.kt"
public final class ext.mods.gameserver.geoengine.PeaceZoneCollisionManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 7, attributes: 2
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/PeaceZoneCollisionManager
    #2 = Class              #1            // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               this
   #10 = Utf8               Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
   #11 = Utf8               canIgnoreCreatureCollision
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #13 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #14 = Utf8               isFeatureEnabled
   #15 = Utf8               ()Z
   #16 = NameAndType        #14:#15       // isFeatureEnabled:()Z
   #17 = Methodref          #2.#16        // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.isFeatureEnabled:()Z
   #18 = Utf8               ext/mods/gameserver/enums/ZoneId
   #19 = Class              #18           // ext/mods/gameserver/enums/ZoneId
   #20 = Utf8               PEACE
   #21 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #22 = NameAndType        #20:#21       // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #23 = Fieldref           #19.#22       // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #24 = Utf8               ext/mods/gameserver/model/actor/Creature
   #25 = Class              #24           // ext/mods/gameserver/model/actor/Creature
   #26 = Utf8               isInsideZone
   #27 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #28 = NameAndType        #26:#27       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #29 = Methodref          #25.#28       // ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #30 = Utf8               getNoCollisionZoneIds
   #31 = Utf8               ()Ljava/util/List;
   #32 = NameAndType        #30:#31       // getNoCollisionZoneIds:()Ljava/util/List;
   #33 = Methodref          #2.#32        // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.getNoCollisionZoneIds:()Ljava/util/List;
   #34 = Utf8               java/util/List
   #35 = Class              #34           // java/util/List
   #36 = Utf8               isEmpty
   #37 = NameAndType        #36:#15       // isEmpty:()Z
   #38 = InterfaceMethodref #35.#37       // java/util/List.isEmpty:()Z
   #39 = Utf8               zoneIds
   #40 = Utf8               Ljava/util/List;
   #41 = Utf8               creature
   #42 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #43 = Utf8               canBypassCollision
   #44 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Z
   #45 = Utf8               isInNoCollisionZone
   #46 = NameAndType        #45:#12       // isInNoCollisionZone:(Lext/mods/gameserver/model/actor/Creature;)Z
   #47 = Methodref          #2.#46        // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.isInNoCollisionZone:(Lext/mods/gameserver/model/actor/Creature;)Z
   #48 = Utf8               creature1
   #49 = Utf8               creature2
   #50 = Utf8               java/lang/Exception
   #51 = Class              #50           // java/lang/Exception
   #52 = Utf8               ext/mods/Config
   #53 = Class              #52           // ext/mods/Config
   #54 = Utf8               ENABLE_PEACE_ZONE_NO_COLLISION
   #55 = String             #54           // ENABLE_PEACE_ZONE_NO_COLLISION
   #56 = Utf8               java/lang/Class
   #57 = Class              #56           // java/lang/Class
   #58 = Utf8               getDeclaredField
   #59 = Utf8               (Ljava/lang/String;)Ljava/lang/reflect/Field;
   #60 = NameAndType        #58:#59       // getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
   #61 = Methodref          #57.#60       // java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
   #62 = Utf8               java/lang/reflect/Field
   #63 = Class              #62           // java/lang/reflect/Field
   #64 = Utf8               setAccessible
   #65 = Utf8               (Z)V
   #66 = NameAndType        #64:#65       // setAccessible:(Z)V
   #67 = Methodref          #63.#66       // java/lang/reflect/Field.setAccessible:(Z)V
   #68 = Utf8               getBoolean
   #69 = Utf8               (Ljava/lang/Object;)Z
   #70 = NameAndType        #68:#69       // getBoolean:(Ljava/lang/Object;)Z
   #71 = Methodref          #63.#70       // java/lang/reflect/Field.getBoolean:(Ljava/lang/Object;)Z
   #72 = Utf8               field
   #73 = Utf8               Ljava/lang/reflect/Field;
   #74 = Utf8               e
   #75 = Utf8               Ljava/lang/Exception;
   #76 = Utf8               ()Ljava/util/List<Ljava/lang/Integer;>;
   #77 = Utf8               PEACE_ZONE_NO_COLLISION_ZONE_IDS
   #78 = String             #77           // PEACE_ZONE_NO_COLLISION_ZONE_IDS
   #79 = Utf8               get
   #80 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #81 = NameAndType        #79:#80       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #82 = Methodref          #63.#81       // java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #83 = Utf8               [I
   #84 = Class              #83           // "[I"
   #85 = Utf8               kotlin/collections/ArraysKt
   #86 = Class              #85           // kotlin/collections/ArraysKt
   #87 = Utf8               toList
   #88 = Utf8               ([I)Ljava/util/List;
   #89 = NameAndType        #87:#88       // toList:([I)Ljava/util/List;
   #90 = Methodref          #86.#89       // kotlin/collections/ArraysKt.toList:([I)Ljava/util/List;
   #91 = Utf8               kotlin/collections/CollectionsKt
   #92 = Class              #91           // kotlin/collections/CollectionsKt
   #93 = Utf8               emptyList
   #94 = NameAndType        #93:#31       // emptyList:()Ljava/util/List;
   #95 = Methodref          #92.#94       // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
   #96 = Utf8               <clinit>
   #97 = Methodref          #2.#7         // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager."<init>":()V
   #98 = Utf8               INSTANCE
   #99 = NameAndType        #98:#10       // INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
  #100 = Fieldref           #2.#99        // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
  #101 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #102 = Utf8               Lkotlin/Metadata;
  #103 = Utf8               mv
  #104 = Integer            2
  #105 = Integer            3
  #106 = Integer            0
  #107 = Utf8               k
  #108 = Integer            1
  #109 = Utf8               xi
  #110 = Integer            48
  #111 = Utf8               d1
  #112 = Utf8               \u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¨\u0006\u0010
  #113 = Utf8               d2
  #114 = Utf8
  #115 = Utf8               Brproject
  #116 = Utf8               PeaceZoneCollisionManager.kt
  #117 = Utf8               RuntimeInvisibleAnnotations
  #118 = Utf8               Code
  #119 = Utf8               LineNumberTable
  #120 = Utf8               LocalVariableTable
  #121 = Utf8               StackMapTable
  #122 = Utf8               RuntimeInvisibleParameterAnnotations
  #123 = Utf8               Signature
  #124 = Utf8               SourceFile
  #125 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.PeaceZoneCollisionManager INSTANCE;
    descriptor: Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #101()
        org.jetbrains.annotations.NotNull

  public final boolean canIgnoreCreatureCollision(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: nop
         1: aload_1
         2: ifnonnull     9
         5: iconst_0
         6: goto          54
         9: aload_0
        10: invokespecial #17                 // Method isFeatureEnabled:()Z
        13: ifne          20
        16: iconst_0
        17: goto          54
        20: aload_1
        21: getstatic     #23                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        24: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        27: ifne          34
        30: iconst_0
        31: goto          54
        34: aload_0
        35: invokespecial #33                 // Method getNoCollisionZoneIds:()Ljava/util/List;
        38: astore_2
        39: nop
        40: aload_2
        41: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        46: ifeq          53
        49: iconst_1
        50: goto          54
        53: iconst_1
        54: ireturn
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 10 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/List ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/PeaceZoneCollisionManager, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ int ]
      LineNumberTable:
        line 32: 0
        line 33: 1
        line 34: 9
        line 35: 20
        line 37: 34
        line 38: 39
        line 39: 40
        line 40: 53
        line 32: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      15     2 zoneIds   Ljava/util/List;
            0      55     0  this   Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
            0      55     1 creature   Lext/mods/gameserver/model/actor/Creature;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.Nullable

  public final boolean canBypassCollision(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: nop
         1: aload_0
         2: invokespecial #17                 // Method isFeatureEnabled:()Z
         5: ifne          12
         8: iconst_0
         9: goto          45
        12: aload_1
        13: ifnull        20
        16: aload_2
        17: ifnonnull     24
        20: iconst_0
        21: goto          45
        24: aload_0
        25: aload_1
        26: invokespecial #47                 // Method isInNoCollisionZone:(Lext/mods/gameserver/model/actor/Creature;)Z
        29: ifeq          44
        32: aload_0
        33: aload_2
        34: invokespecial #47                 // Method isInNoCollisionZone:(Lext/mods/gameserver/model/actor/Creature;)Z
        37: ifeq          44
        40: iconst_1
        41: goto          45
        44: iconst_0
        45: ireturn
      StackMapTable: number_of_entries = 5
        frame_type = 12 /* same */
        frame_type = 7 /* same */
        frame_type = 3 /* same */
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 47: 0
        line 48: 1
        line 49: 12
        line 50: 24
        line 47: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
            0      46     1 creature1   Lext/mods/gameserver/model/actor/Creature;
            0      46     2 creature2   Lext/mods/gameserver/model/actor/Creature;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.Nullable
      parameter 1:
        0: #13()
          org.jetbrains.annotations.Nullable

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/PeaceZoneCollisionManager
         3: dup
         4: invokespecial #97                 // Method "<init>":()V
         7: putstatic     #100                // Field INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
        10: return
}
SourceFile: "PeaceZoneCollisionManager.kt"
RuntimeVisibleAnnotations:
  0: #102(#103=[I#104,I#105,I#106],#107=I#108,#109=I#110,#111=[s#112],#113=[s#10,s#114,s#5,s#6,s#11,s#114,s#41,s#42,s#43,s#48,s#49,s#45,s#14,s#30,s#114,s#114,s#115])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¨\u0006\u0010"]
      d2=["Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;","","<init>","()V","canIgnoreCreatureCollision","","creature","Lext/mods/gameserver/model/actor/Creature;","canBypassCollision","creature1","creature2","isInNoCollisionZone","isFeatureEnabled","getNoCollisionZoneIds","","","Brproject"]
    )
