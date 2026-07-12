// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\SourceType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.class
  Last modified 9 de jul de 2026; size 2069 bytes
  MD5 checksum e3553714d4d062e4450d1ea8e6d2e83e
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType extends java.lang.Enum<ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  super_class: #5                         // java/lang/Enum
  interfaces: 0, fields: 5, methods: 6, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
   #3 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;>;
   #4 = Utf8               java/lang/Enum
   #5 = Class              #4             // java/lang/Enum
   #6 = Utf8               <init>
   #7 = Utf8               (Ljava/lang/String;I)V
   #8 = Utf8               ()V
   #9 = NameAndType        #6:#7          // "<init>":(Ljava/lang/String;I)V
  #10 = Methodref          #5.#9          // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #11 = Utf8               this
  #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #13 = Utf8               $enum$name
  #14 = Utf8               Ljava/lang/String;
  #15 = Utf8               $enum$ordinal
  #16 = Utf8               I
  #17 = Utf8               values
  #18 = Utf8               ()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #19 = Utf8               $VALUES
  #20 = Utf8               [Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #21 = NameAndType        #19:#20        // $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #22 = Fieldref           #2.#21         // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.$VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #23 = Utf8               java/lang/Object
  #24 = Class              #23            // java/lang/Object
  #25 = Utf8               clone
  #26 = Utf8               ()Ljava/lang/Object;
  #27 = NameAndType        #25:#26        // clone:()Ljava/lang/Object;
  #28 = Methodref          #24.#27        // java/lang/Object.clone:()Ljava/lang/Object;
  #29 = Class              #20            // "[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;"
  #30 = Utf8               valueOf
  #31 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #32 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #33 = NameAndType        #30:#32        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Methodref          #5.#33         // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #35 = Utf8               value
  #36 = Utf8               getEntries
  #37 = Utf8               ()Lkotlin/enums/EnumEntries;
  #38 = Utf8               ()Lkotlin/enums/EnumEntries<Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;>;
  #39 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #40 = Utf8               $ENTRIES
  #41 = Utf8               Lkotlin/enums/EnumEntries;
  #42 = NameAndType        #40:#41        // $ENTRIES:Lkotlin/enums/EnumEntries;
  #43 = Fieldref           #2.#42         // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.$ENTRIES:Lkotlin/enums/EnumEntries;
  #44 = Utf8               $values
  #45 = Utf8               L2J
  #46 = NameAndType        #45:#12        // L2J:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #47 = Fieldref           #2.#46         // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.L2J:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #48 = Utf8               CONV_DAT
  #49 = NameAndType        #48:#12        // CONV_DAT:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #50 = Fieldref           #2.#49         // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.CONV_DAT:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #51 = Utf8               MIXED
  #52 = NameAndType        #51:#12        // MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #53 = Fieldref           #2.#52         // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #54 = Utf8               <clinit>
  #55 = String             #45            // L2J
  #56 = Methodref          #2.#9          // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType."<init>":(Ljava/lang/String;I)V
  #57 = String             #48            // CONV_DAT
  #58 = String             #51            // MIXED
  #59 = NameAndType        #44:#18        // $values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #60 = Methodref          #2.#59         // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.$values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #61 = Utf8               [Ljava/lang/Enum;
  #62 = Class              #61            // "[Ljava/lang/Enum;"
  #63 = Utf8               kotlin/enums/EnumEntriesKt
  #64 = Class              #63            // kotlin/enums/EnumEntriesKt
  #65 = Utf8               enumEntries
  #66 = Utf8               ([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #67 = NameAndType        #65:#66        // enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #68 = Methodref          #64.#67        // kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #69 = Utf8               Lkotlin/Metadata;
  #70 = Utf8               mv
  #71 = Integer            2
  #72 = Integer            3
  #73 = Integer            0
  #74 = Utf8               k
  #75 = Integer            1
  #76 = Utf8               xi
  #77 = Integer            48
  #78 = Utf8               d1
  #79 = Utf8               \u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007
  #80 = Utf8               d2
  #81 = Utf8
  #82 = Utf8               Brproject
  #83 = Utf8               L2BRSerializer.kt
  #84 = Utf8               Code
  #85 = Utf8               LineNumberTable
  #86 = Utf8               LocalVariableTable
  #87 = Utf8               Signature
  #88 = Utf8               RuntimeInvisibleAnnotations
  #89 = Utf8               SourceFile
  #90 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType L2J;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType CONV_DAT;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType MIXED;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType[] values();
    descriptor: ()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
         3: invokevirtual #28                 // Method java/lang/Object.clone:()Ljava/lang/Object;
         6: checkcast     #29                 // class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;"
         9: areturn

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
         2: aload_0
         3: invokestatic  #34                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
         9: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0 value   Ljava/lang/String;

  public static kotlin.enums.EnumEntries<ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType> getEntries();
    descriptor: ()Lkotlin/enums/EnumEntries;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #43                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
         3: areturn
    Signature: #38                          // ()Lkotlin/enums/EnumEntries<Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;>;
    RuntimeInvisibleAnnotations:
      0: #39()
        org.jetbrains.annotations.NotNull

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
         3: dup
         4: ldc           #55                 // String L2J
         6: iconst_0
         7: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #47                 // Field L2J:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        13: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
        16: dup
        17: ldc           #57                 // String CONV_DAT
        19: iconst_1
        20: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #50                 // Field CONV_DAT:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        26: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
        29: dup
        30: ldc           #58                 // String MIXED
        32: iconst_2
        33: invokespecial #56                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #53                 // Field MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        39: invokestatic  #60                 // Method $values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        42: putstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        45: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        48: checkcast     #62                 // class "[Ljava/lang/Enum;"
        51: invokestatic  #68                 // Method kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
        54: putstatic     #43                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
        57: return
      LineNumberTable:
        line 435: 0
}
Signature: #3                           // Ljava/lang/Enum<Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;>;
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #69(#70=[I#71,I#72,I#73],#74=I#75,#76=I#77,#78=[s#79],#80=[s#12,s#81,s#6,s#7,s#45,s#48,s#51,s#82])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;","","<init>","(Ljava/lang/String;I)V","L2J","CONV_DAT","MIXED","Brproject"]
    )
