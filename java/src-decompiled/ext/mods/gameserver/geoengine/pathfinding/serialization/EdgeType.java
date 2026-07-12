// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\EdgeType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.class
  Last modified 9 de jul de 2026; size 2106 bytes
  MD5 checksum 697746c82bff03c42e7f7b7f5c8d77ff
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType extends java.lang.Enum<ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
  super_class: #5                         // java/lang/Enum
  interfaces: 0, fields: 6, methods: 6, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
   #3 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;>;
   #4 = Utf8               java/lang/Enum
   #5 = Class              #4             // java/lang/Enum
   #6 = Utf8               <init>
   #7 = Utf8               (Ljava/lang/String;I)V
   #8 = Utf8               ()V
   #9 = NameAndType        #6:#7          // "<init>":(Ljava/lang/String;I)V
  #10 = Methodref          #5.#9          // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #11 = Utf8               this
  #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #13 = Utf8               $enum$name
  #14 = Utf8               Ljava/lang/String;
  #15 = Utf8               $enum$ordinal
  #16 = Utf8               I
  #17 = Utf8               values
  #18 = Utf8               ()[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #19 = Utf8               $VALUES
  #20 = Utf8               [Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #21 = NameAndType        #19:#20        // $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #22 = Fieldref           #2.#21         // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.$VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #23 = Utf8               java/lang/Object
  #24 = Class              #23            // java/lang/Object
  #25 = Utf8               clone
  #26 = Utf8               ()Ljava/lang/Object;
  #27 = NameAndType        #25:#26        // clone:()Ljava/lang/Object;
  #28 = Methodref          #24.#27        // java/lang/Object.clone:()Ljava/lang/Object;
  #29 = Class              #20            // "[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;"
  #30 = Utf8               valueOf
  #31 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #32 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #33 = NameAndType        #30:#32        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Methodref          #5.#33         // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #35 = Utf8               value
  #36 = Utf8               getEntries
  #37 = Utf8               ()Lkotlin/enums/EnumEntries;
  #38 = Utf8               ()Lkotlin/enums/EnumEntries<Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;>;
  #39 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #40 = Utf8               $ENTRIES
  #41 = Utf8               Lkotlin/enums/EnumEntries;
  #42 = NameAndType        #40:#41        // $ENTRIES:Lkotlin/enums/EnumEntries;
  #43 = Fieldref           #2.#42         // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.$ENTRIES:Lkotlin/enums/EnumEntries;
  #44 = Utf8               $values
  #45 = Utf8               WALK
  #46 = NameAndType        #45:#12        // WALK:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #47 = Fieldref           #2.#46         // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.WALK:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #48 = Utf8               JUMP
  #49 = NameAndType        #48:#12        // JUMP:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #50 = Fieldref           #2.#49         // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.JUMP:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #51 = Utf8               CLIMB
  #52 = NameAndType        #51:#12        // CLIMB:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #53 = Fieldref           #2.#52         // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.CLIMB:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #54 = Utf8               FALL
  #55 = NameAndType        #54:#12        // FALL:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #56 = Fieldref           #2.#55         // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.FALL:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #57 = Utf8               <clinit>
  #58 = String             #45            // WALK
  #59 = Methodref          #2.#9          // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType."<init>":(Ljava/lang/String;I)V
  #60 = String             #48            // JUMP
  #61 = String             #51            // CLIMB
  #62 = String             #54            // FALL
  #63 = NameAndType        #44:#18        // $values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #64 = Methodref          #2.#63         // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.$values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #65 = Utf8               [Ljava/lang/Enum;
  #66 = Class              #65            // "[Ljava/lang/Enum;"
  #67 = Utf8               kotlin/enums/EnumEntriesKt
  #68 = Class              #67            // kotlin/enums/EnumEntriesKt
  #69 = Utf8               enumEntries
  #70 = Utf8               ([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #71 = NameAndType        #69:#70        // enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #72 = Methodref          #68.#71        // kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #73 = Utf8               Lkotlin/Metadata;
  #74 = Utf8               mv
  #75 = Integer            2
  #76 = Integer            3
  #77 = Integer            0
  #78 = Utf8               k
  #79 = Integer            1
  #80 = Utf8               xi
  #81 = Integer            48
  #82 = Utf8               d1
  #83 = Utf8               \u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b
  #84 = Utf8               d2
  #85 = Utf8
  #86 = Utf8               Brproject
  #87 = Utf8               L2BRSerializer.kt
  #88 = Utf8               Code
  #89 = Utf8               LineNumberTable
  #90 = Utf8               LocalVariableTable
  #91 = Utf8               Signature
  #92 = Utf8               RuntimeInvisibleAnnotations
  #93 = Utf8               SourceFile
  #94 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType WALK;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType JUMP;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType CLIMB;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType FALL;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType[] values();
    descriptor: ()[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
         3: invokevirtual #28                 // Method java/lang/Object.clone:()Ljava/lang/Object;
         6: checkcast     #29                 // class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;"
         9: areturn

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
         2: aload_0
         3: invokestatic  #34                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
         9: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0 value   Ljava/lang/String;

  public static kotlin.enums.EnumEntries<ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType> getEntries();
    descriptor: ()Lkotlin/enums/EnumEntries;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #43                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
         3: areturn
    Signature: #38                          // ()Lkotlin/enums/EnumEntries<Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;>;
    RuntimeInvisibleAnnotations:
      0: #39()
        org.jetbrains.annotations.NotNull

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
         3: dup
         4: ldc           #58                 // String WALK
         6: iconst_0
         7: invokespecial #59                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #47                 // Field WALK:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        13: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
        16: dup
        17: ldc           #60                 // String JUMP
        19: iconst_1
        20: invokespecial #59                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #50                 // Field JUMP:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        26: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
        29: dup
        30: ldc           #61                 // String CLIMB
        32: iconst_2
        33: invokespecial #59                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #53                 // Field CLIMB:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        39: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
        42: dup
        43: ldc           #62                 // String FALL
        45: iconst_3
        46: invokespecial #59                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #56                 // Field FALL:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        52: invokestatic  #64                 // Method $values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        55: putstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        58: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        61: checkcast     #66                 // class "[Ljava/lang/Enum;"
        64: invokestatic  #72                 // Method kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
        67: putstatic     #43                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
        70: return
      LineNumberTable:
        line 420: 0
}
Signature: #3                           // Ljava/lang/Enum<Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;>;
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #73(#74=[I#75,I#76,I#77],#78=I#79,#80=I#81,#82=[s#83],#84=[s#12,s#85,s#6,s#7,s#45,s#48,s#51,s#54,s#86])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;","","<init>","(Ljava/lang/String;I)V","WALK","JUMP","CLIMB","FALL","Brproject"]
    )
