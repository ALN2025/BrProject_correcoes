// Bytecode for: ext.mods.gameserver.model.holder.BalanceName
// File: ext\mods\gameserver\model\holder\BalanceName.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/holder/BalanceName.class
  Last modified 9 de jul de 2026; size 2841 bytes
  MD5 checksum e6cad9642cac5cdb3177ceff808ee205
  Compiled from "BalanceName.java"
public class ext.mods.gameserver.model.holder.BalanceName
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/holder/BalanceName
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/holder/BalanceName._classNames:Ljava/util/Map;
    #8 = Class              #10           // ext/mods/gameserver/model/holder/BalanceName
    #9 = NameAndType        #11:#12       // _classNames:Ljava/util/Map;
   #10 = Utf8               ext/mods/gameserver/model/holder/BalanceName
   #11 = Utf8               _classNames
   #12 = Utf8               Ljava/util/Map;
   #13 = Methodref          #14.#15       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #14 = Class              #16           // java/lang/Integer
   #15 = NameAndType        #17:#18       // valueOf:(I)Ljava/lang/Integer;
   #16 = Utf8               java/lang/Integer
   #17 = Utf8               valueOf
   #18 = Utf8               (I)Ljava/lang/Integer;
   #19 = InvokeDynamic      #0:#20        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #20 = NameAndType        #21:#22       // makeConcatWithConstants:(I)Ljava/lang/String;
   #21 = Utf8               makeConcatWithConstants
   #22 = Utf8               (I)Ljava/lang/String;
   #23 = InterfaceMethodref #24.#25       // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #24 = Class              #26           // java/util/Map
   #25 = NameAndType        #27:#28       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #26 = Utf8               java/util/Map
   #27 = Utf8               getOrDefault
   #28 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #29 = Class              #30           // java/lang/String
   #30 = Utf8               java/lang/String
   #31 = Class              #32           // java/util/ArrayList
   #32 = Utf8               java/util/ArrayList
   #33 = InterfaceMethodref #24.#34       // java/util/Map.keySet:()Ljava/util/Set;
   #34 = NameAndType        #35:#36       // keySet:()Ljava/util/Set;
   #35 = Utf8               keySet
   #36 = Utf8               ()Ljava/util/Set;
   #37 = Methodref          #31.#38       // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #38 = NameAndType        #5:#39        // "<init>":(Ljava/util/Collection;)V
   #39 = Utf8               (Ljava/util/Collection;)V
   #40 = Class              #41           // java/util/HashMap
   #41 = Utf8               java/util/HashMap
   #42 = Methodref          #40.#3        // java/util/HashMap."<init>":()V
   #43 = String             #44           // Duelist
   #44 = Utf8               Duelist
   #45 = InterfaceMethodref #24.#46       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #46 = NameAndType        #47:#28       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Utf8               put
   #48 = String             #49           // Dreadnought
   #49 = Utf8               Dreadnought
   #50 = String             #51           // Phoenix Knight
   #51 = Utf8               Phoenix Knight
   #52 = String             #53           // Hell Knight
   #53 = Utf8               Hell Knight
   #54 = String             #55           // Sagittarius
   #55 = Utf8               Sagittarius
   #56 = String             #57           // Adventurer
   #57 = Utf8               Adventurer
   #58 = String             #59           // Archmage
   #59 = Utf8               Archmage
   #60 = String             #61           // Soultaker
   #61 = Utf8               Soultaker
   #62 = String             #63           // Arcana Lord
   #63 = Utf8               Arcana Lord
   #64 = String             #65           // Cardinal
   #65 = Utf8               Cardinal
   #66 = String             #67           // Hierophant
   #67 = Utf8               Hierophant
   #68 = String             #69           // Eva Templar
   #69 = Utf8               Eva Templar
   #70 = String             #71           // Sword Muse
   #71 = Utf8               Sword Muse
   #72 = String             #73           // Wind Rider
   #73 = Utf8               Wind Rider
   #74 = String             #75           // Moonlight Sentinel
   #75 = Utf8               Moonlight Sentinel
   #76 = String             #77           // Mystic Muse
   #77 = Utf8               Mystic Muse
   #78 = String             #79           // Elemental Master
   #79 = Utf8               Elemental Master
   #80 = String             #81           // Eva Saint
   #81 = Utf8               Eva Saint
   #82 = String             #83           // Shillien Templar
   #83 = Utf8               Shillien Templar
   #84 = String             #85           // Spectral Dancer
   #85 = Utf8               Spectral Dancer
   #86 = String             #87           // Ghost Hunter
   #87 = Utf8               Ghost Hunter
   #88 = String             #89           // Ghost Sentinel
   #89 = Utf8               Ghost Sentinel
   #90 = String             #91           // Storm Screamer
   #91 = Utf8               Storm Screamer
   #92 = String             #93           // Spectral Master
   #93 = Utf8               Spectral Master
   #94 = String             #95           // Shillien Saint
   #95 = Utf8               Shillien Saint
   #96 = String             #97           // Titan
   #97 = Utf8               Titan
   #98 = String             #99           // Grand Khauatari
   #99 = Utf8               Grand Khauatari
  #100 = String             #101          // Dominator
  #101 = Utf8               Dominator
  #102 = String             #103          // Doomcryer
  #103 = Utf8               Doomcryer
  #104 = String             #105          // Fortune Seeker
  #105 = Utf8               Fortune Seeker
  #106 = String             #107          // Maestro
  #107 = Utf8               Maestro
  #108 = Utf8               Signature
  #109 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;
  #110 = Utf8               Code
  #111 = Utf8               LineNumberTable
  #112 = Utf8               LocalVariableTable
  #113 = Utf8               this
  #114 = Utf8               Lext/mods/gameserver/model/holder/BalanceName;
  #115 = Utf8               getName
  #116 = Utf8               classId
  #117 = Utf8               I
  #118 = Utf8               getClassIdList
  #119 = Utf8               ()Ljava/util/List;
  #120 = Utf8               ()Ljava/util/List<Ljava/lang/Integer;>;
  #121 = Utf8               getClassMap
  #122 = Utf8               ()Ljava/util/Map;
  #123 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;
  #124 = Utf8               <clinit>
  #125 = Utf8               SourceFile
  #126 = Utf8               BalanceName.java
  #127 = Utf8               BootstrapMethods
  #128 = String             #129          // Unknown (\u0001)
  #129 = Utf8               Unknown (\u0001)
  #130 = MethodHandle       6:#131        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #131 = Methodref          #132.#133     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #132 = Class              #134          // java/lang/invoke/StringConcatFactory
  #133 = NameAndType        #21:#135      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #134 = Utf8               java/lang/invoke/StringConcatFactory
  #135 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #136 = Utf8               InnerClasses
  #137 = Class              #138          // java/lang/invoke/MethodHandles$Lookup
  #138 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #139 = Class              #140          // java/lang/invoke/MethodHandles
  #140 = Utf8               java/lang/invoke/MethodHandles
  #141 = Utf8               Lookup
{
  public ext.mods.gameserver.model.holder.BalanceName();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/BalanceName;

  public static java.lang.String getName(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=1
         0: getstatic     #7                  // Field _classNames:Ljava/util/Map;
         3: iload_0
         4: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         7: iload_0
         8: invokedynamic #19,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        13: invokeinterface #23,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        18: checkcast     #29                 // class java/lang/String
        21: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0 classId   I

  public static java.util.List<java.lang.Integer> getClassIdList();
    descriptor: ()Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #31                 // class java/util/ArrayList
         3: dup
         4: getstatic     #7                  // Field _classNames:Ljava/util/Map;
         7: invokeinterface #33,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
        12: invokespecial #37                 // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        15: areturn
      LineNumberTable:
        line 71: 0
    Signature: #120                         // ()Ljava/util/List<Ljava/lang/Integer;>;

  public static java.util.Map<java.lang.Integer, java.lang.String> getClassMap();
    descriptor: ()Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #7                  // Field _classNames:Ljava/util/Map;
         3: areturn
      LineNumberTable:
        line 76: 0
    Signature: #123                         // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #40                 // class java/util/HashMap
         3: dup
         4: invokespecial #42                 // Method java/util/HashMap."<init>":()V
         7: putstatic     #7                  // Field _classNames:Ljava/util/Map;
        10: getstatic     #7                  // Field _classNames:Ljava/util/Map;
        13: bipush        88
        15: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        18: ldc           #43                 // String Duelist
        20: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        25: pop
        26: getstatic     #7                  // Field _classNames:Ljava/util/Map;
        29: bipush        89
        31: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: ldc           #48                 // String Dreadnought
        36: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        41: pop
        42: getstatic     #7                  // Field _classNames:Ljava/util/Map;
        45: bipush        90
        47: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        50: ldc           #50                 // String Phoenix Knight
        52: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        57: pop
        58: getstatic     #7                  // Field _classNames:Ljava/util/Map;
        61: bipush        91
        63: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        66: ldc           #52                 // String Hell Knight
        68: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        73: pop
        74: getstatic     #7                  // Field _classNames:Ljava/util/Map;
        77: bipush        92
        79: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        82: ldc           #54                 // String Sagittarius
        84: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        89: pop
        90: getstatic     #7                  // Field _classNames:Ljava/util/Map;
        93: bipush        93
        95: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        98: ldc           #56                 // String Adventurer
       100: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       105: pop
       106: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       109: bipush        94
       111: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       114: ldc           #58                 // String Archmage
       116: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       121: pop
       122: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       125: bipush        95
       127: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       130: ldc           #60                 // String Soultaker
       132: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       137: pop
       138: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       141: bipush        96
       143: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       146: ldc           #62                 // String Arcana Lord
       148: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       153: pop
       154: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       157: bipush        97
       159: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       162: ldc           #64                 // String Cardinal
       164: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       169: pop
       170: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       173: bipush        98
       175: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       178: ldc           #66                 // String Hierophant
       180: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       185: pop
       186: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       189: bipush        99
       191: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       194: ldc           #68                 // String Eva Templar
       196: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       201: pop
       202: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       205: bipush        100
       207: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       210: ldc           #70                 // String Sword Muse
       212: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       217: pop
       218: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       221: bipush        101
       223: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       226: ldc           #72                 // String Wind Rider
       228: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       233: pop
       234: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       237: bipush        102
       239: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       242: ldc           #74                 // String Moonlight Sentinel
       244: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       249: pop
       250: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       253: bipush        103
       255: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       258: ldc           #76                 // String Mystic Muse
       260: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       265: pop
       266: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       269: bipush        104
       271: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       274: ldc           #78                 // String Elemental Master
       276: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       281: pop
       282: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       285: bipush        105
       287: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       290: ldc           #80                 // String Eva Saint
       292: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       297: pop
       298: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       301: bipush        106
       303: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       306: ldc           #82                 // String Shillien Templar
       308: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       313: pop
       314: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       317: bipush        107
       319: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       322: ldc           #84                 // String Spectral Dancer
       324: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       329: pop
       330: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       333: bipush        108
       335: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       338: ldc           #86                 // String Ghost Hunter
       340: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       345: pop
       346: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       349: bipush        109
       351: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       354: ldc           #88                 // String Ghost Sentinel
       356: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       361: pop
       362: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       365: bipush        110
       367: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       370: ldc           #90                 // String Storm Screamer
       372: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       377: pop
       378: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       381: bipush        111
       383: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       386: ldc           #92                 // String Spectral Master
       388: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       393: pop
       394: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       397: bipush        112
       399: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       402: ldc           #94                 // String Shillien Saint
       404: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       409: pop
       410: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       413: bipush        113
       415: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       418: ldc           #96                 // String Titan
       420: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       425: pop
       426: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       429: bipush        114
       431: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       434: ldc           #98                 // String Grand Khauatari
       436: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       441: pop
       442: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       445: bipush        115
       447: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       450: ldc           #100                // String Dominator
       452: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       457: pop
       458: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       461: bipush        116
       463: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       466: ldc           #102                // String Doomcryer
       468: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       473: pop
       474: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       477: bipush        117
       479: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       482: ldc           #104                // String Fortune Seeker
       484: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       489: pop
       490: getstatic     #7                  // Field _classNames:Ljava/util/Map;
       493: bipush        118
       495: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       498: ldc           #106                // String Maestro
       500: invokeinterface #45,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       505: pop
       506: return
      LineNumberTable:
        line 27: 0
        line 31: 10
        line 32: 26
        line 33: 42
        line 34: 58
        line 35: 74
        line 36: 90
        line 37: 106
        line 38: 122
        line 39: 138
        line 40: 154
        line 41: 170
        line 42: 186
        line 43: 202
        line 44: 218
        line 45: 234
        line 46: 250
        line 47: 266
        line 48: 282
        line 49: 298
        line 50: 314
        line 51: 330
        line 52: 346
        line 53: 362
        line 54: 378
        line 55: 394
        line 56: 410
        line 57: 426
        line 58: 442
        line 59: 458
        line 60: 474
        line 61: 490
        line 62: 506
}
SourceFile: "BalanceName.java"
BootstrapMethods:
  0: #130 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #128 Unknown (\u0001)
InnerClasses:
  public static final #141= #137 of #139; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
