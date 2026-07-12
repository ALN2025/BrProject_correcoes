// Bytecode for: ext.mods.commons.Team
// File: ext\mods\commons\Team.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/Team.class
  Last modified 9 de jul de 2026; size 4233 bytes
  MD5 checksum bab14beec78d119dc3bfd0f29c07d2f0
  Compiled from "Team.java"
public final class ext.mods.commons.Team
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/commons/Team
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 10, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/commons/Team.infoGameServer:()V
    #8 = Class              #10           // ext/mods/commons/Team
    #9 = NameAndType        #11:#6        // infoGameServer:()V
   #10 = Utf8               ext/mods/commons/Team
   #11 = Utf8               infoGameServer
   #12 = String             #13           // LOGIN SERVER
   #13 = Utf8               LOGIN SERVER
   #14 = Methodref          #8.#15        // ext/mods/commons/Team.printBanner:(Ljava/lang/String;)V
   #15 = NameAndType        #16:#17       // printBanner:(Ljava/lang/String;)V
   #16 = Utf8               printBanner
   #17 = Utf8               (Ljava/lang/String;)V
   #18 = String             #19           // GAME SERVER
   #19 = Utf8               GAME SERVER
   #20 = String             #21           // BR PROJECT LAUNCHER
   #21 = Utf8               BR PROJECT LAUNCHER
   #22 = Fieldref           #23.#24       // java/lang/System.out:Ljava/io/PrintStream;
   #23 = Class              #25           // java/lang/System
   #24 = NameAndType        #26:#27       // out:Ljava/io/PrintStream;
   #25 = Utf8               java/lang/System
   #26 = Utf8               out
   #27 = Utf8               Ljava/io/PrintStream;
   #28 = Class              #29           // ext/mods/commons/BrProjectMeta
   #29 = Utf8               ext/mods/commons/BrProjectMeta
   #30 = String             #31           // \u001b[96m-----------------------------------------------------------------------=[ \u001b[93mBRPROJECT\u001b[96m ]\u001b[0m
   #31 = Utf8               \u001b[96m-----------------------------------------------------------------------=[ \u001b[93mBRPROJECT\u001b[96m ]\u001b[0m
   #32 = Methodref          #33.#34       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #33 = Class              #35           // java/io/PrintStream
   #34 = NameAndType        #36:#17       // println:(Ljava/lang/String;)V
   #35 = Utf8               java/io/PrintStream
   #36 = Utf8               println
   #37 = InvokeDynamic      #0:#38        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #38 = NameAndType        #39:#40       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #39 = Utf8               makeConcatWithConstants
   #40 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #41 = Fieldref           #8.#42        // ext/mods/commons/Team.LOGO:[Ljava/lang/String;
   #42 = NameAndType        #43:#44       // LOGO:[Ljava/lang/String;
   #43 = Utf8               LOGO
   #44 = Utf8               [Ljava/lang/String;
   #45 = Methodref          #8.#46        // ext/mods/commons/Team.trimLogoLine:(Ljava/lang/String;)Ljava/lang/String;
   #46 = NameAndType        #47:#40       // trimLogoLine:(Ljava/lang/String;)Ljava/lang/String;
   #47 = Utf8               trimLogoLine
   #48 = Methodref          #8.#49        // ext/mods/commons/Team.printAsciiLine:(Ljava/lang/String;)V
   #49 = NameAndType        #50:#17       // printAsciiLine:(Ljava/lang/String;)V
   #50 = Utf8               printAsciiLine
   #51 = String             #52           // \u001b[96m:::::::::::::::::::::::::::::::::::::::::::::::::[ Brproject ]::::::::::::::::::::::::::::::::::::::::::::::::::::::\u001b[0m
   #52 = Utf8               \u001b[96m:::::::::::::::::::::::::::::::::::::::::::::::::[ Brproject ]::::::::::::::::::::::::::::::::::::::::::::::::::::::\u001b[0m
   #53 = String             #54           // MODO DISTRIBUICAO (Brproject_Distribution)
   #54 = Utf8               MODO DISTRIBUICAO (Brproject_Distribution)
   #55 = Methodref          #8.#56        // ext/mods/commons/Team.printYellowDotted:(Ljava/lang/String;)V
   #56 = NameAndType        #57:#17       // printYellowDotted:(Ljava/lang/String;)V
   #57 = Utf8               printYellowDotted
   #58 = String             #59           // BUILD 2026 | 3.8 | Brproject
   #59 = Utf8               BUILD 2026 | 3.8 | Brproject
   #60 = String             #61           // CORE: Dhousefe-L2JBR | Agazes33 | Ban-L2jDev | Warman | SrEli | Dev < A.L.N/>
   #61 = Utf8               CORE: Dhousefe-L2JBR | Agazes33 | Ban-L2jDev | Warman | SrEli | Dev < A.L.N/>
   #62 = String             #63           //
   #63 = Utf8
   #64 = String             #65           // \u001b[96m-----------------------------------------------------------------------=[ \u001b[93mBrproject\u001b[96m ]\u001b[0m
   #65 = Utf8               \u001b[96m-----------------------------------------------------------------------=[ \u001b[93mBrproject\u001b[96m ]\u001b[0m
   #66 = Methodref          #33.#67       // java/io/PrintStream.flush:()V
   #67 = NameAndType        #68:#6        // flush:()V
   #68 = Utf8               flush
   #69 = Methodref          #70.#71       // java/lang/String.length:()I
   #70 = Class              #72           // java/lang/String
   #71 = NameAndType        #73:#74       // length:()I
   #72 = Utf8               java/lang/String
   #73 = Utf8               length
   #74 = Utf8               ()I
   #75 = Methodref          #70.#76       // java/lang/String.substring:(II)Ljava/lang/String;
   #76 = NameAndType        #77:#78       // substring:(II)Ljava/lang/String;
   #77 = Utf8               substring
   #78 = Utf8               (II)Ljava/lang/String;
   #79 = InvokeDynamic      #1:#38        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #80 = InvokeDynamic      #2:#38        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #81 = String             #82           // :::::::::##:::::::::#######:::::::::##:::::::::::::::::::::::::##############:::::::##########:::::::::::::::::::::::
   #82 = Utf8               :::::::::##:::::::::#######:::::::::##:::::::::::::::::::::::::##############:::::::##########:::::::::::::::::::::::
   #83 = String             #84           // :::::::::##::::::::##:::::##::::::::##:::::::::::::::::::::::::##::::::::::###::::::##::::::###::::::::::::::::::::::
   #84 = Utf8               :::::::::##::::::::##:::::##::::::::##:::::::::::::::::::::::::##::::::::::###::::::##::::::###::::::::::::::::::::::
   #85 = String             #86           // :::::::::##:::::::::::::::##::::::::##:::::::::::::::::::::::::##::::::::::###::::::##::::::###::::::::::::::::::::::
   #86 = Utf8               :::::::::##:::::::::::::::##::::::::##:::::::::::::::::::::::::##::::::::::###::::::##::::::###::::::::::::::::::::::
   #87 = String             #88           // :::::::::##:::::::::#######:::::::::##::::::::::########:::::::##############:::::::##########:::::::::::::::::::::::
   #88 = Utf8               :::::::::##:::::::::#######:::::::::##::::::::::########:::::::##############:::::::##########:::::::::::::::::::::::
   #89 = String             #90           // :::::::::##::::::::##:::::::::::::::##::::::::::########:::::::###############::::::###########::::::::::::::::::::::
   #90 = Utf8               :::::::::##::::::::##:::::::::::::::##::::::::::########:::::::###############::::::###########::::::::::::::::::::::
   #91 = String             #92           // :::::::::##::::::::##:::::::::::::::##::::::::::########:::::::##:::::::::::##::::::##::::::::##:::::::::::::::::::::::
   #92 = Utf8               :::::::::##::::::::##:::::::::::::::##::::::::::########:::::::##:::::::::::##::::::##::::::::##:::::::::::::::::::::::
   #93 = String             #94           // :::::::::########::#########:::######::::::::::::::::::::::::::##:::::::::::##::::::##::::::::##:::::::::::::::::::::::
   #94 = Utf8               :::::::::########::#########:::######::::::::::::::::::::::::::##:::::::::::##::::::##::::::::##:::::::::::::::::::::::
   #95 = String             #96           // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::##############:::::::##::::::::##:::::::::::::::::::::::
   #96 = Utf8               :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::##############:::::::##::::::::##:::::::::::::::::::::::
   #97 = Utf8               RESET
   #98 = Utf8               Ljava/lang/String;
   #99 = Utf8               ConstantValue
  #100 = String             #101          // \u001b[0m
  #101 = Utf8               \u001b[0m
  #102 = Utf8               BOLD
  #103 = String             #104          // \u001b[1m
  #104 = Utf8               \u001b[1m
  #105 = Utf8               BRIGHT_CYAN
  #106 = String             #107          // \u001b[96m
  #107 = Utf8               \u001b[96m
  #108 = Utf8               BRIGHT_YELLOW
  #109 = String             #110          // \u001b[93m
  #110 = Utf8               \u001b[93m
  #111 = Utf8               LOGO_WIDTH
  #112 = Utf8               I
  #113 = Integer            117
  #114 = Utf8               YELLOW_PREFIX
  #115 = String             #116          // :::::::::::::::::::::::::::::::::::
  #116 = Utf8               :::::::::::::::::::::::::::::::::::
  #117 = Utf8               BRAND_LINE
  #118 = String             #119          // :::::::::::::::::::::::::::::::::::::::::::::::::[ Brproject ]::::::::::::::::::::::::::::::::::::::::::::::::::::::
  #119 = Utf8               :::::::::::::::::::::::::::::::::::::::::::::::::[ Brproject ]::::::::::::::::::::::::::::::::::::::::::::::::::::::
  #120 = Utf8               Code
  #121 = Utf8               LineNumberTable
  #122 = Utf8               LocalVariableTable
  #123 = Utf8               this
  #124 = Utf8               Lext/mods/commons/Team;
  #125 = Utf8               info
  #126 = Utf8               infoLoginServer
  #127 = Utf8               infoLauncher
  #128 = Utf8               line
  #129 = Utf8               serverName
  #130 = Utf8               StackMapTable
  #131 = Class              #44           // "[Ljava/lang/String;"
  #132 = Utf8               text
  #133 = Utf8               <clinit>
  #134 = Utf8               SourceFile
  #135 = Utf8               Team.java
  #136 = Utf8               BootstrapMethods
  #137 = String             #138          // \u001b[96m----------------------------------------=[ \u001b[93m\u0001\u001b[96m ]---------------------------------\u001b[0m
  #138 = Utf8               \u001b[96m----------------------------------------=[ \u001b[93m\u0001\u001b[96m ]---------------------------------\u001b[0m
  #139 = String             #140          // \u001b[93m::::::::::::::::::::::::::::::::::: \u0001\u001b[0m
  #140 = Utf8               \u001b[93m::::::::::::::::::::::::::::::::::: \u0001\u001b[0m
  #141 = String             #142          // \u001b[96m\u0001\u001b[0m
  #142 = Utf8               \u001b[96m\u0001\u001b[0m
  #143 = MethodHandle       6:#144        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #144 = Methodref          #145.#146     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #145 = Class              #147          // java/lang/invoke/StringConcatFactory
  #146 = NameAndType        #39:#148      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #147 = Utf8               java/lang/invoke/StringConcatFactory
  #148 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #149 = Utf8               InnerClasses
  #150 = Class              #151          // java/lang/invoke/MethodHandles$Lookup
  #151 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #152 = Class              #153          // java/lang/invoke/MethodHandles
  #153 = Utf8               java/lang/invoke/MethodHandles
  #154 = Utf8               Lookup
{
  public static void info();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=0, locals=0, args_size=0
         0: invokestatic  #7                  // Method infoGameServer:()V
         3: return
      LineNumberTable:
        line 43: 0
        line 44: 3

  public static void infoLoginServer();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #12                 // String LOGIN SERVER
         2: invokestatic  #14                 // Method printBanner:(Ljava/lang/String;)V
         5: return
      LineNumberTable:
        line 48: 0
        line 49: 5

  public static void infoGameServer();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #18                 // String GAME SERVER
         2: invokestatic  #14                 // Method printBanner:(Ljava/lang/String;)V
         5: return
      LineNumberTable:
        line 53: 0
        line 54: 5

  public static void infoLauncher();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #20                 // String BR PROJECT LAUNCHER
         2: invokestatic  #14                 // Method printBanner:(Ljava/lang/String;)V
         5: return
      LineNumberTable:
        line 59: 0
        line 60: 5

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        8
         2: anewarray     #70                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #81                 // String :::::::::##:::::::::#######:::::::::##:::::::::::::::::::::::::##############:::::::##########:::::::::::::::::::::::
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #83                 // String :::::::::##::::::::##:::::##::::::::##:::::::::::::::::::::::::##::::::::::###::::::##::::::###::::::::::::::::::::::
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #85                 // String :::::::::##:::::::::::::::##::::::::##:::::::::::::::::::::::::##::::::::::###::::::##::::::###::::::::::::::::::::::
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #87                 // String :::::::::##:::::::::#######:::::::::##::::::::::########:::::::##############:::::::##########:::::::::::::::::::::::
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #89                 // String :::::::::##::::::::##:::::::::::::::##::::::::::########:::::::###############::::::###########::::::::::::::::::::::
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #91                 // String :::::::::##::::::::##:::::::::::::::##::::::::::########:::::::##:::::::::::##::::::##::::::::##:::::::::::::::::::::::
        34: aastore
        35: dup
        36: bipush        6
        38: ldc           #93                 // String :::::::::########::#########:::######::::::::::::::::::::::::::##:::::::::::##::::::##::::::::##:::::::::::::::::::::::
        40: aastore
        41: dup
        42: bipush        7
        44: ldc           #95                 // String :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::##############:::::::##::::::::##:::::::::::::::::::::::
        46: aastore
        47: putstatic     #41                 // Field LOGO:[Ljava/lang/String;
        50: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "Team.java"
BootstrapMethods:
  0: #143 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #137 \u001b[96m----------------------------------------=[ \u001b[93m\u0001\u001b[96m ]---------------------------------\u001b[0m
  1: #143 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #139 \u001b[93m::::::::::::::::::::::::::::::::::: \u0001\u001b[0m
  2: #143 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #141 \u001b[96m\u0001\u001b[0m
InnerClasses:
  public static final #154= #150 of #152; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
