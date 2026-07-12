// Bytecode for: ext.mods.gameserver.data.manager.FestivalOfDarknessManager$FestivalManager
// File: ext\mods\gameserver\data\manager\FestivalOfDarknessManager$FestivalManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager.class
  Last modified 9 de jul de 2026; size 2911 bytes
  MD5 checksum 3fb5a06307962f2ac57d2f3f408ccbfb
  Compiled from "FestivalOfDarknessManager.java"
public class ext.mods.gameserver.data.manager.FestivalOfDarknessManager$FestivalManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager
  super_class: #14                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager.this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
    #8 = Class              #10           // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager
    #9 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #10 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #13 = Methodref          #14.#15       // java/lang/Object."<init>":()V
   #14 = Class              #16           // java/lang/Object
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/lang/Object
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Fieldref           #20.#21       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._managerInstance:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
   #20 = Class              #22           // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #21 = NameAndType        #23:#24       // _managerInstance:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
   #22 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #23 = Utf8               _managerInstance
   #24 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
   #25 = Fieldref           #20.#26       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._festivalCycle:I
   #26 = NameAndType        #27:#28       // _festivalCycle:I
   #27 = Utf8               _festivalCycle
   #28 = Utf8               I
   #29 = Methodref          #30.#31       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #30 = Class              #32           // java/util/Calendar
   #31 = NameAndType        #33:#34       // getInstance:()Ljava/util/Calendar;
   #32 = Utf8               java/util/Calendar
   #33 = Utf8               getInstance
   #34 = Utf8               ()Ljava/util/Calendar;
   #35 = Methodref          #30.#36       // java/util/Calendar.get:(I)I
   #36 = NameAndType        #37:#38       // get:(I)I
   #37 = Utf8               get
   #38 = Utf8               (I)I
   #39 = Methodref          #20.#40       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setNextFestivalStart:(J)V
   #40 = NameAndType        #41:#42       // setNextFestivalStart:(J)V
   #41 = Utf8               setNextFestivalStart
   #42 = Utf8               (J)V
   #43 = Methodref          #20.#44       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInitialized:()Z
   #44 = NameAndType        #45:#46       // isFestivalInitialized:()Z
   #45 = Utf8               isFestivalInitialized
   #46 = Utf8               ()Z
   #47 = Fieldref           #48.#49       // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
   #48 = Class              #50           // ext/mods/gameserver/enums/CabalType
   #49 = NameAndType        #51:#52       // DUSK:Lext/mods/gameserver/enums/CabalType;
   #50 = Utf8               ext/mods/gameserver/enums/CabalType
   #51 = Utf8               DUSK
   #52 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #53 = Fieldref           #8.#54        // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager._festivalInstances:Ljava/util/Map;
   #54 = NameAndType        #55:#56       // _festivalInstances:Ljava/util/Map;
   #55 = Utf8               _festivalInstances
   #56 = Utf8               Ljava/util/Map;
   #57 = Methodref          #58.#59       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #58 = Class              #60           // java/lang/Integer
   #59 = NameAndType        #61:#62       // valueOf:(I)Ljava/lang/Integer;
   #60 = Utf8               java/lang/Integer
   #61 = Utf8               valueOf
   #62 = Utf8               (I)Ljava/lang/Integer;
   #63 = InterfaceMethodref #64.#65       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Class              #66           // java/util/Map
   #65 = NameAndType        #37:#6        // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Utf8               java/util/Map
   #67 = Class              #68           // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
   #68 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
   #69 = Class              #70           // java/lang/IllegalArgumentException
   #70 = Utf8               java/lang/IllegalArgumentException
   #71 = String             #72           // Festival instance cannot be null
   #72 = Utf8               Festival instance cannot be null
   #73 = Methodref          #69.#74       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #74 = NameAndType        #17:#75       // "<init>":(Ljava/lang/String;)V
   #75 = Utf8               (Ljava/lang/String;)V
   #76 = InterfaceMethodref #64.#77       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #77 = NameAndType        #78:#79       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #78 = Utf8               put
   #79 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #80 = Class              #81           // java/util/HashMap
   #81 = Utf8               java/util/HashMap
   #82 = Methodref          #80.#15       // java/util/HashMap."<init>":()V
   #83 = Utf8               Signature
   #84 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;>;
   #85 = Utf8               (Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;)V
   #86 = Utf8               Code
   #87 = Utf8               LineNumberTable
   #88 = Utf8               LocalVariableTable
   #89 = Utf8               minsToNextFestival
   #90 = Utf8               this
   #91 = Utf8               currentMinute
   #92 = Utf8               StackMapTable
   #93 = Utf8               MethodParameters
   #94 = Utf8               getFestivalInstance
   #95 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
   #96 = Utf8               oracle
   #97 = Utf8               festivalId
   #98 = Utf8               ()Ljava/util/Map;
   #99 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;>;
  #100 = Utf8               setFestivalInstance
  #101 = Utf8               (ILext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;)V
  #102 = Utf8               festivalInstance
  #103 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
  #104 = Utf8               <clinit>
  #105 = Utf8               SourceFile
  #106 = Utf8               FestivalOfDarknessManager.java
  #107 = Utf8               NestHost
  #108 = Utf8               InnerClasses
  #109 = Utf8               FestivalManager
  #110 = Utf8               L2DarknessFestival
{
  public static java.util.Map<java.lang.Integer, ext.mods.gameserver.data.manager.FestivalOfDarknessManager$L2DarknessFestival> _festivalInstances;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #84                          // Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;>;

  final ext.mods.gameserver.data.manager.FestivalOfDarknessManager this$0;
    descriptor: Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.data.manager.FestivalOfDarknessManager$FestivalManager(ext.mods.gameserver.data.manager.FestivalOfDarknessManager);
    descriptor: (Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: aload_1
        15: aload_0
        16: putfield      #19                 // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager._managerInstance:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
        19: aload_1
        20: dup
        21: getfield      #25                 // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager._festivalCycle:I
        24: iconst_1
        25: iadd
        26: putfield      #25                 // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager._festivalCycle:I
        29: invokestatic  #29                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        32: bipush        12
        34: invokevirtual #35                 // Method java/util/Calendar.get:(I)I
        37: istore_2
        38: iload_2
        39: bipush        40
        41: if_icmplt     52
        44: bipush        60
        46: iload_2
        47: isub
        48: istore_3
        49: goto          71
        52: iload_2
        53: bipush        20
        55: if_icmplt     66
        58: bipush        40
        60: iload_2
        61: isub
        62: istore_3
        63: goto          71
        66: bipush        20
        68: iload_2
        69: isub
        70: istore_3
        71: aload_1
        72: iload_3
        73: bipush        60
        75: imul
        76: sipush        1000
        79: imul
        80: i2l
        81: invokevirtual #39                 // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setNextFestivalStart:(J)V
        84: return
      LineNumberTable:
        line 800: 0
        line 801: 14
        line 803: 19
        line 805: 29
        line 808: 38
        line 809: 44
        line 810: 52
        line 811: 58
        line 813: 66
        line 815: 71
        line 816: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49       3     3 minsToNextFestival   I
           63       3     3 minsToNextFestival   I
            0      85     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
            0      85     1 this$0   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
           38      47     2 currentMinute   I
           71      14     3 minsToNextFestival   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager, class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, int ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public final ext.mods.gameserver.data.manager.FestivalOfDarknessManager$L2DarknessFestival getFestivalInstance(ext.mods.gameserver.enums.CabalType, int);
    descriptor: (Lext/mods/gameserver/enums/CabalType;I)Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
         4: invokevirtual #43                 // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInitialized:()Z
         7: ifne          12
        10: aconst_null
        11: areturn
        12: iload_2
        13: aload_1
        14: getstatic     #47                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        17: if_acmpne     25
        20: bipush        10
        22: goto          27
        25: bipush        20
        27: iadd
        28: istore_2
        29: getstatic     #53                 // Field _festivalInstances:Ljava/util/Map;
        32: iload_2
        33: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: invokeinterface #63,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        41: checkcast     #67                 // class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
        44: areturn
      LineNumberTable:
        line 827: 0
        line 828: 10
        line 834: 12
        line 835: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
            0      45     1 oracle   Lext/mods/gameserver/enums/CabalType;
            0      45     2 festivalId   I
      StackMapTable: number_of_entries = 3
        frame_type = 12 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager, class ext/mods/gameserver/enums/CabalType, int ]
          stack = [ int, int ]

  public static final java.util.Map<java.lang.Integer, ext.mods.gameserver.data.manager.FestivalOfDarknessManager$L2DarknessFestival> getFestivalInstance();
    descriptor: ()Ljava/util/Map;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #53                 // Field _festivalInstances:Ljava/util/Map;
         3: areturn
      LineNumberTable:
        line 840: 0
    Signature: #99                          // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;>;

  public static final void setFestivalInstance(int, ext.mods.gameserver.data.manager.FestivalOfDarknessManager$L2DarknessFestival);
    descriptor: (ILext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     14
         4: new           #69                 // class java/lang/IllegalArgumentException
         7: dup
         8: ldc           #71                 // String Festival instance cannot be null
        10: invokespecial #73                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        13: athrow
        14: getstatic     #53                 // Field _festivalInstances:Ljava/util/Map;
        17: iload_0
        18: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        21: aload_1
        22: invokeinterface #76,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        27: pop
        28: return
      LineNumberTable:
        line 845: 0
        line 846: 4
        line 848: 14
        line 849: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0 festivalId   I
            0      29     1 festivalInstance   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #80                 // class java/util/HashMap
         3: dup
         4: invokespecial #82                 // Method java/util/HashMap."<init>":()V
         7: putstatic     #53                 // Field _festivalInstances:Ljava/util/Map;
        10: return
      LineNumberTable:
        line 797: 0
}
SourceFile: "FestivalOfDarknessManager.java"
NestHost: class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
InnerClasses:
  public #109= #8 of #20;                 // FestivalManager=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  public #110= #67 of #20;                // L2DarknessFestival=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
