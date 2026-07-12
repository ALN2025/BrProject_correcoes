// Bytecode for: ext.mods.commons.pool.CoroutinePool$ExecutionRoute
// File: ext\mods\commons\pool\CoroutinePool$ExecutionRoute.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/CoroutinePool$ExecutionRoute.class
  Last modified 9 de jul de 2026; size 1994 bytes
  MD5 checksum f51356bae9e45ab90bb30ea3b8e212bc
  Compiled from "CoroutinePool.kt"
public final class ext.mods.commons.pool.CoroutinePool$ExecutionRoute extends java.lang.Enum<ext.mods.commons.pool.CoroutinePool$ExecutionRoute>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #2                          // ext/mods/commons/pool/CoroutinePool$ExecutionRoute
  super_class: #5                         // java/lang/Enum
  interfaces: 0, fields: 4, methods: 6, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/commons/pool/CoroutinePool$ExecutionRoute
   #2 = Class              #1             // ext/mods/commons/pool/CoroutinePool$ExecutionRoute
   #3 = Utf8               Ljava/lang/Enum<Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;>;
   #4 = Utf8               java/lang/Enum
   #5 = Class              #4             // java/lang/Enum
   #6 = Utf8               <init>
   #7 = Utf8               (Ljava/lang/String;I)V
   #8 = Utf8               ()V
   #9 = NameAndType        #6:#7          // "<init>":(Ljava/lang/String;I)V
  #10 = Methodref          #5.#9          // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #11 = Utf8               this
  #12 = Utf8               Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #13 = Utf8               $enum$name
  #14 = Utf8               Ljava/lang/String;
  #15 = Utf8               $enum$ordinal
  #16 = Utf8               I
  #17 = Utf8               values
  #18 = Utf8               ()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #19 = Utf8               $VALUES
  #20 = Utf8               [Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #21 = NameAndType        #19:#20        // $VALUES:[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #22 = Fieldref           #2.#21         // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.$VALUES:[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #23 = Utf8               java/lang/Object
  #24 = Class              #23            // java/lang/Object
  #25 = Utf8               clone
  #26 = Utf8               ()Ljava/lang/Object;
  #27 = NameAndType        #25:#26        // clone:()Ljava/lang/Object;
  #28 = Methodref          #24.#27        // java/lang/Object.clone:()Ljava/lang/Object;
  #29 = Class              #20            // "[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;"
  #30 = Utf8               valueOf
  #31 = Utf8               (Ljava/lang/String;)Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #32 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #33 = NameAndType        #30:#32        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Methodref          #5.#33         // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #35 = Utf8               value
  #36 = Utf8               getEntries
  #37 = Utf8               ()Lkotlin/enums/EnumEntries;
  #38 = Utf8               ()Lkotlin/enums/EnumEntries<Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;>;
  #39 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #40 = Utf8               $ENTRIES
  #41 = Utf8               Lkotlin/enums/EnumEntries;
  #42 = NameAndType        #40:#41        // $ENTRIES:Lkotlin/enums/EnumEntries;
  #43 = Fieldref           #2.#42         // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.$ENTRIES:Lkotlin/enums/EnumEntries;
  #44 = Utf8               $values
  #45 = Utf8               PLATFORM
  #46 = NameAndType        #45:#12        // PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #47 = Fieldref           #2.#46         // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #48 = Utf8               VIRTUAL
  #49 = NameAndType        #48:#12        // VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #50 = Fieldref           #2.#49         // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #51 = Utf8               <clinit>
  #52 = String             #45            // PLATFORM
  #53 = Methodref          #2.#9          // ext/mods/commons/pool/CoroutinePool$ExecutionRoute."<init>":(Ljava/lang/String;I)V
  #54 = String             #48            // VIRTUAL
  #55 = NameAndType        #44:#18        // $values:()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #56 = Methodref          #2.#55         // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.$values:()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #57 = Utf8               [Ljava/lang/Enum;
  #58 = Class              #57            // "[Ljava/lang/Enum;"
  #59 = Utf8               kotlin/enums/EnumEntriesKt
  #60 = Class              #59            // kotlin/enums/EnumEntriesKt
  #61 = Utf8               enumEntries
  #62 = Utf8               ([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #63 = NameAndType        #61:#62        // enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #64 = Methodref          #60.#63        // kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #65 = Utf8               Lkotlin/Metadata;
  #66 = Utf8               mv
  #67 = Integer            2
  #68 = Integer            3
  #69 = Integer            0
  #70 = Utf8               k
  #71 = Integer            1
  #72 = Utf8               xi
  #73 = Integer            48
  #74 = Utf8               d1
  #75 = Utf8               \u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006
  #76 = Utf8               d2
  #77 = Utf8
  #78 = Utf8               Brproject
  #79 = Utf8               ext/mods/commons/pool/CoroutinePool
  #80 = Class              #79            // ext/mods/commons/pool/CoroutinePool
  #81 = Utf8               ExecutionRoute
  #82 = Utf8               CoroutinePool.kt
  #83 = Utf8               Code
  #84 = Utf8               LineNumberTable
  #85 = Utf8               LocalVariableTable
  #86 = Utf8               Signature
  #87 = Utf8               RuntimeInvisibleAnnotations
  #88 = Utf8               InnerClasses
  #89 = Utf8               SourceFile
  #90 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.commons.pool.CoroutinePool$ExecutionRoute PLATFORM;
    descriptor: Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.pool.CoroutinePool$ExecutionRoute VIRTUAL;
    descriptor: Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.commons.pool.CoroutinePool$ExecutionRoute[] values();
    descriptor: ()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
         3: invokevirtual #28                 // Method java/lang/Object.clone:()Ljava/lang/Object;
         6: checkcast     #29                 // class "[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;"
         9: areturn

  public static ext.mods.commons.pool.CoroutinePool$ExecutionRoute valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #2                  // class ext/mods/commons/pool/CoroutinePool$ExecutionRoute
         2: aload_0
         3: invokestatic  #34                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #2                  // class ext/mods/commons/pool/CoroutinePool$ExecutionRoute
         9: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0 value   Ljava/lang/String;

  public static kotlin.enums.EnumEntries<ext.mods.commons.pool.CoroutinePool$ExecutionRoute> getEntries();
    descriptor: ()Lkotlin/enums/EnumEntries;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #43                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
         3: areturn
    Signature: #38                          // ()Lkotlin/enums/EnumEntries<Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;>;
    RuntimeInvisibleAnnotations:
      0: #39()
        org.jetbrains.annotations.NotNull

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #2                  // class ext/mods/commons/pool/CoroutinePool$ExecutionRoute
         3: dup
         4: ldc           #52                 // String PLATFORM
         6: iconst_0
         7: invokespecial #53                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #47                 // Field PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
        13: new           #2                  // class ext/mods/commons/pool/CoroutinePool$ExecutionRoute
        16: dup
        17: ldc           #54                 // String VIRTUAL
        19: iconst_1
        20: invokespecial #53                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #50                 // Field VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
        26: invokestatic  #56                 // Method $values:()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
        29: putstatic     #22                 // Field $VALUES:[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
        32: getstatic     #22                 // Field $VALUES:[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
        35: checkcast     #58                 // class "[Ljava/lang/Enum;"
        38: invokestatic  #64                 // Method kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
        41: putstatic     #43                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
        44: return
      LineNumberTable:
        line 56: 0
}
InnerClasses:
  public static final #81= #2 of #80;     // ExecutionRoute=class ext/mods/commons/pool/CoroutinePool$ExecutionRoute of class ext/mods/commons/pool/CoroutinePool
Signature: #3                           // Ljava/lang/Enum<Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;>;
SourceFile: "CoroutinePool.kt"
RuntimeVisibleAnnotations:
  0: #65(#66=[I#67,I#68,I#69],#70=I#71,#72=I#73,#74=[s#75],#76=[s#12,s#77,s#6,s#7,s#45,s#48,s#78])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"]
      d2=["Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;","","<init>","(Ljava/lang/String;I)V","PLATFORM","VIRTUAL","Brproject"]
    )
