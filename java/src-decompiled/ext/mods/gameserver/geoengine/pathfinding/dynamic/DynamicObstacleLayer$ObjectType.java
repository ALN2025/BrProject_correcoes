// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType
// File: ext\mods\gameserver\geoengine\pathfinding\dynamic\DynamicObstacleLayer$ObjectType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.class
  Last modified 9 de jul de 2026; size 2440 bytes
  MD5 checksum 64e2f00118fb32c3abdc902d196ef0ea
  Compiled from "DynamicObstacleLayer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType extends java.lang.Enum<ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
  super_class: #5                         // java/lang/Enum
  interfaces: 0, fields: 7, methods: 6, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
    #3 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;>;
    #4 = Utf8               java/lang/Enum
    #5 = Class              #4            // java/lang/Enum
    #6 = Utf8               <init>
    #7 = Utf8               (Ljava/lang/String;I)V
    #8 = Utf8               ()V
    #9 = NameAndType        #6:#7         // "<init>":(Ljava/lang/String;I)V
   #10 = Methodref          #5.#9         // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #11 = Utf8               this
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #13 = Utf8               $enum$name
   #14 = Utf8               Ljava/lang/String;
   #15 = Utf8               $enum$ordinal
   #16 = Utf8               I
   #17 = Utf8               values
   #18 = Utf8               ()[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #19 = Utf8               $VALUES
   #20 = Utf8               [Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #21 = NameAndType        #19:#20       // $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.$VALUES:[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #23 = Utf8               java/lang/Object
   #24 = Class              #23           // java/lang/Object
   #25 = Utf8               clone
   #26 = Utf8               ()Ljava/lang/Object;
   #27 = NameAndType        #25:#26       // clone:()Ljava/lang/Object;
   #28 = Methodref          #24.#27       // java/lang/Object.clone:()Ljava/lang/Object;
   #29 = Class              #20           // "[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;"
   #30 = Utf8               valueOf
   #31 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #32 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #33 = NameAndType        #30:#32       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #34 = Methodref          #5.#33        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #35 = Utf8               value
   #36 = Utf8               getEntries
   #37 = Utf8               ()Lkotlin/enums/EnumEntries;
   #38 = Utf8               ()Lkotlin/enums/EnumEntries<Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;>;
   #39 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #40 = Utf8               $ENTRIES
   #41 = Utf8               Lkotlin/enums/EnumEntries;
   #42 = NameAndType        #40:#41       // $ENTRIES:Lkotlin/enums/EnumEntries;
   #43 = Fieldref           #2.#42        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.$ENTRIES:Lkotlin/enums/EnumEntries;
   #44 = Utf8               $values
   #45 = Utf8               DOOR
   #46 = NameAndType        #45:#12       // DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #47 = Fieldref           #2.#46        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #48 = Utf8               WALL
   #49 = NameAndType        #48:#12       // WALL:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #50 = Fieldref           #2.#49        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.WALL:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #51 = Utf8               SIEGE_WEAPON
   #52 = NameAndType        #51:#12       // SIEGE_WEAPON:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #53 = Fieldref           #2.#52        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.SIEGE_WEAPON:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #54 = Utf8               NPC_BARRIER
   #55 = NameAndType        #54:#12       // NPC_BARRIER:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #56 = Fieldref           #2.#55        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.NPC_BARRIER:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #57 = Utf8               TEMPORARY
   #58 = NameAndType        #57:#12       // TEMPORARY:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #59 = Fieldref           #2.#58        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.TEMPORARY:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #60 = Utf8               <clinit>
   #61 = String             #45           // DOOR
   #62 = Methodref          #2.#9         // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType."<init>":(Ljava/lang/String;I)V
   #63 = String             #48           // WALL
   #64 = String             #51           // SIEGE_WEAPON
   #65 = String             #54           // NPC_BARRIER
   #66 = String             #57           // TEMPORARY
   #67 = NameAndType        #44:#18       // $values:()[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #68 = Methodref          #2.#67        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType.$values:()[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #69 = Utf8               [Ljava/lang/Enum;
   #70 = Class              #69           // "[Ljava/lang/Enum;"
   #71 = Utf8               kotlin/enums/EnumEntriesKt
   #72 = Class              #71           // kotlin/enums/EnumEntriesKt
   #73 = Utf8               enumEntries
   #74 = Utf8               ([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
   #75 = NameAndType        #73:#74       // enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
   #76 = Methodref          #72.#75       // kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
   #77 = Utf8               Lkotlin/Metadata;
   #78 = Utf8               mv
   #79 = Integer            2
   #80 = Integer            3
   #81 = Integer            0
   #82 = Utf8               k
   #83 = Integer            1
   #84 = Utf8               xi
   #85 = Integer            48
   #86 = Utf8               d1
   #87 = Utf8               \u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t
   #88 = Utf8               d2
   #89 = Utf8
   #90 = Utf8               Brproject
   #91 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #92 = Class              #91           // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #93 = Utf8               ObjectType
   #94 = Utf8               DynamicObstacleLayer.kt
   #95 = Utf8               Code
   #96 = Utf8               LineNumberTable
   #97 = Utf8               LocalVariableTable
   #98 = Utf8               Signature
   #99 = Utf8               RuntimeInvisibleAnnotations
  #100 = Utf8               InnerClasses
  #101 = Utf8               SourceFile
  #102 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType DOOR;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType WALL;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType SIEGE_WEAPON;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType NPC_BARRIER;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType TEMPORARY;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType[] values();
    descriptor: ()[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
         3: invokevirtual #28                 // Method java/lang/Object.clone:()Ljava/lang/Object;
         6: checkcast     #29                 // class "[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;"
         9: areturn

  public static ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
         2: aload_0
         3: invokestatic  #34                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
         9: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0 value   Ljava/lang/String;

  public static kotlin.enums.EnumEntries<ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType> getEntries();
    descriptor: ()Lkotlin/enums/EnumEntries;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #43                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
         3: areturn
    Signature: #38                          // ()Lkotlin/enums/EnumEntries<Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;>;
    RuntimeInvisibleAnnotations:
      0: #39()
        org.jetbrains.annotations.NotNull

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
         3: dup
         4: ldc           #61                 // String DOOR
         6: iconst_0
         7: invokespecial #62                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #47                 // Field DOOR:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        13: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
        16: dup
        17: ldc           #63                 // String WALL
        19: iconst_1
        20: invokespecial #62                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #50                 // Field WALL:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        26: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
        29: dup
        30: ldc           #64                 // String SIEGE_WEAPON
        32: iconst_2
        33: invokespecial #62                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #53                 // Field SIEGE_WEAPON:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        39: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
        42: dup
        43: ldc           #65                 // String NPC_BARRIER
        45: iconst_3
        46: invokespecial #62                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #56                 // Field NPC_BARRIER:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        52: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
        55: dup
        56: ldc           #66                 // String TEMPORARY
        58: iconst_4
        59: invokespecial #62                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #59                 // Field TEMPORARY:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        65: invokestatic  #68                 // Method $values:()[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        68: putstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        71: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        74: checkcast     #70                 // class "[Ljava/lang/Enum;"
        77: invokestatic  #76                 // Method kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
        80: putstatic     #43                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
        83: return
      LineNumberTable:
        line 181: 0
        line 182: 13
        line 183: 26
        line 184: 39
        line 185: 52
}
InnerClasses:
  public static final #93= #2 of #92;     // ObjectType=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
Signature: #3                           // Ljava/lang/Enum<Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;>;
SourceFile: "DynamicObstacleLayer.kt"
RuntimeVisibleAnnotations:
  0: #77(#78=[I#79,I#80,I#81],#82=I#83,#84=I#85,#86=[s#87],#88=[s#12,s#89,s#6,s#7,s#45,s#48,s#51,s#54,s#57,s#90])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;","","<init>","(Ljava/lang/String;I)V","DOOR","WALL","SIEGE_WEAPON","NPC_BARRIER","TEMPORARY","Brproject"]
    )
