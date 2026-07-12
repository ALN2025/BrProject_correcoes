// Bytecode for: ext.mods.gameserver.data.HTMLData$1
// File: ext\mods\gameserver\data\HTMLData$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/HTMLData$1.class
  Last modified 9 de jul de 2026; size 3416 bytes
  MD5 checksum 5e9281a25a561e73da898f88e2da6a98
  Compiled from "HTMLData.java"
class ext.mods.gameserver.data.HTMLData$1 extends java.nio.file.SimpleFileVisitor<java.nio.file.Path>
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/HTMLData$1
  super_class: #14                        // java/nio/file/SimpleFileVisitor
  interfaces: 0, fields: 1, methods: 4, attributes: 6
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/data/HTMLData$1.this$0:Lext/mods/gameserver/data/HTMLData;
    #8 = Class              #10           // ext/mods/gameserver/data/HTMLData$1
    #9 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/data/HTMLData;
   #10 = Utf8               ext/mods/gameserver/data/HTMLData$1
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/data/HTMLData;
   #13 = Methodref          #14.#15       // java/nio/file/SimpleFileVisitor."<init>":()V
   #14 = Class              #16           // java/nio/file/SimpleFileVisitor
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/nio/file/SimpleFileVisitor
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Fieldref           #20.#21       // ext/mods/gameserver/data/HTMLData.HTML_ROOT:Ljava/nio/file/Path;
   #20 = Class              #22           // ext/mods/gameserver/data/HTMLData
   #21 = NameAndType        #23:#24       // HTML_ROOT:Ljava/nio/file/Path;
   #22 = Utf8               ext/mods/gameserver/data/HTMLData
   #23 = Utf8               HTML_ROOT
   #24 = Utf8               Ljava/nio/file/Path;
   #25 = InterfaceMethodref #26.#27       // java/nio/file/Path.relativize:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
   #26 = Class              #28           // java/nio/file/Path
   #27 = NameAndType        #29:#30       // relativize:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
   #28 = Utf8               java/nio/file/Path
   #29 = Utf8               relativize
   #30 = Utf8               (Ljava/nio/file/Path;)Ljava/nio/file/Path;
   #31 = InterfaceMethodref #26.#32       // java/nio/file/Path.toString:()Ljava/lang/String;
   #32 = NameAndType        #33:#34       // toString:()Ljava/lang/String;
   #33 = Utf8               toString
   #34 = Utf8               ()Ljava/lang/String;
   #35 = String             #36           // \\
   #36 = Utf8               \\
   #37 = String             #38           // /
   #38 = Utf8               /
   #39 = Methodref          #40.#41       // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #40 = Class              #42           // java/lang/String
   #41 = NameAndType        #43:#44       // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #42 = Utf8               java/lang/String
   #43 = Utf8               replace
   #44 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #45 = String             #46           // .htm
   #46 = Utf8               .htm
   #47 = Methodref          #40.#48       // java/lang/String.endsWith:(Ljava/lang/String;)Z
   #48 = NameAndType        #49:#50       // endsWith:(Ljava/lang/String;)Z
   #49 = Utf8               endsWith
   #50 = Utf8               (Ljava/lang/String;)Z
   #51 = String             #52           // .html
   #52 = Utf8               .html
   #53 = Fieldref           #54.#55       // java/nio/file/FileVisitResult.CONTINUE:Ljava/nio/file/FileVisitResult;
   #54 = Class              #56           // java/nio/file/FileVisitResult
   #55 = NameAndType        #57:#58       // CONTINUE:Ljava/nio/file/FileVisitResult;
   #56 = Utf8               java/nio/file/FileVisitResult
   #57 = Utf8               CONTINUE
   #58 = Utf8               Ljava/nio/file/FileVisitResult;
   #59 = Methodref          #60.#61       // java/util/concurrent/ForkJoinPool.commonPool:()Ljava/util/concurrent/ForkJoinPool;
   #60 = Class              #62           // java/util/concurrent/ForkJoinPool
   #61 = NameAndType        #63:#64       // commonPool:()Ljava/util/concurrent/ForkJoinPool;
   #62 = Utf8               java/util/concurrent/ForkJoinPool
   #63 = Utf8               commonPool
   #64 = Utf8               ()Ljava/util/concurrent/ForkJoinPool;
   #65 = InvokeDynamic      #0:#66        // #0:run:(Lext/mods/gameserver/data/HTMLData$1;Ljava/lang/String;Ljava/nio/file/Path;)Ljava/lang/Runnable;
   #66 = NameAndType        #67:#68       // run:(Lext/mods/gameserver/data/HTMLData$1;Ljava/lang/String;Ljava/nio/file/Path;)Ljava/lang/Runnable;
   #67 = Utf8               run
   #68 = Utf8               (Lext/mods/gameserver/data/HTMLData$1;Ljava/lang/String;Ljava/nio/file/Path;)Ljava/lang/Runnable;
   #69 = Methodref          #60.#70       // java/util/concurrent/ForkJoinPool.execute:(Ljava/lang/Runnable;)V
   #70 = NameAndType        #71:#72       // execute:(Ljava/lang/Runnable;)V
   #71 = Utf8               execute
   #72 = Utf8               (Ljava/lang/Runnable;)V
   #73 = Methodref          #8.#74        // ext/mods/gameserver/data/HTMLData$1.visitFile:(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
   #74 = NameAndType        #75:#76       // visitFile:(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
   #75 = Utf8               visitFile
   #76 = Utf8               (Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
   #77 = Fieldref           #20.#78       // ext/mods/gameserver/data/HTMLData._data:Ljava/util/Map;
   #78 = NameAndType        #79:#80       // _data:Ljava/util/Map;
   #79 = Utf8               _data
   #80 = Utf8               Ljava/util/Map;
   #81 = InvokeDynamic      #1:#82        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #82 = NameAndType        #83:#84       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #83 = Utf8               makeConcatWithConstants
   #84 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #85 = Methodref          #20.#86       // ext/mods/gameserver/data/HTMLData.readString:(Ljava/nio/file/Path;)Ljava/lang/String;
   #86 = NameAndType        #87:#88       // readString:(Ljava/nio/file/Path;)Ljava/lang/String;
   #87 = Utf8               readString
   #88 = Utf8               (Ljava/nio/file/Path;)Ljava/lang/String;
   #89 = InterfaceMethodref #90.#91       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #90 = Class              #92           // java/util/Map
   #91 = NameAndType        #93:#94       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #92 = Utf8               java/util/Map
   #93 = Utf8               put
   #94 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #95 = Class              #96           // ext/mods/gameserver/data/DataException
   #96 = Utf8               ext/mods/gameserver/data/DataException
   #97 = Methodref          #95.#98       // ext/mods/gameserver/data/DataException.printStackTrace:()V
   #98 = NameAndType        #99:#18       // printStackTrace:()V
   #99 = Utf8               printStackTrace
  #100 = Utf8               (Lext/mods/gameserver/data/HTMLData;)V
  #101 = Utf8               Code
  #102 = Utf8               LineNumberTable
  #103 = Utf8               LocalVariableTable
  #104 = Utf8               this
  #105 = Utf8               Lext/mods/gameserver/data/HTMLData$1;
  #106 = Utf8               MethodParameters
  #107 = Utf8               file
  #108 = Utf8               attrs
  #109 = Utf8               Ljava/nio/file/attribute/BasicFileAttributes;
  #110 = Utf8               relative
  #111 = Utf8               Ljava/lang/String;
  #112 = Utf8               StackMapTable
  #113 = Utf8               (Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
  #114 = Utf8               Exceptions
  #115 = Class              #116          // java/io/IOException
  #116 = Utf8               java/io/IOException
  #117 = Utf8               lambda$visitFile$0
  #118 = Utf8               (Ljava/lang/String;Ljava/nio/file/Path;)V
  #119 = Utf8               e
  #120 = Utf8               Lext/mods/gameserver/data/DataException;
  #121 = Utf8               Signature
  #122 = Utf8               Ljava/nio/file/SimpleFileVisitor<Ljava/nio/file/Path;>;
  #123 = Utf8               SourceFile
  #124 = Utf8               HTMLData.java
  #125 = Utf8               EnclosingMethod
  #126 = NameAndType        #127:#18      // doLoadHtml:()V
  #127 = Utf8               doLoadHtml
  #128 = Utf8               NestHost
  #129 = Utf8               BootstrapMethods
  #130 = MethodType         #18           //  ()V
  #131 = MethodHandle       5:#132        // REF_invokeVirtual ext/mods/gameserver/data/HTMLData$1.lambda$visitFile$0:(Ljava/lang/String;Ljava/nio/file/Path;)V
  #132 = Methodref          #8.#133       // ext/mods/gameserver/data/HTMLData$1.lambda$visitFile$0:(Ljava/lang/String;Ljava/nio/file/Path;)V
  #133 = NameAndType        #117:#118     // lambda$visitFile$0:(Ljava/lang/String;Ljava/nio/file/Path;)V
  #134 = String             #135          // html/\u0001
  #135 = Utf8               html/\u0001
  #136 = MethodHandle       6:#137        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #137 = Methodref          #138.#139     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #138 = Class              #140          // java/lang/invoke/LambdaMetafactory
  #139 = NameAndType        #141:#142     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #140 = Utf8               java/lang/invoke/LambdaMetafactory
  #141 = Utf8               metafactory
  #142 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #143 = MethodHandle       6:#144        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #144 = Methodref          #145.#146     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #145 = Class              #147          // java/lang/invoke/StringConcatFactory
  #146 = NameAndType        #83:#148      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #147 = Utf8               java/lang/invoke/StringConcatFactory
  #148 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #149 = Utf8               InnerClasses
  #150 = Class              #151          // java/lang/invoke/MethodHandles$Lookup
  #151 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #152 = Class              #153          // java/lang/invoke/MethodHandles
  #153 = Utf8               java/lang/invoke/MethodHandles
  #154 = Utf8               Lookup
{
  final ext.mods.gameserver.data.HTMLData this$0;
    descriptor: Lext/mods/gameserver/data/HTMLData;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.data.HTMLData$1(ext.mods.gameserver.data.HTMLData);
    descriptor: (Lext/mods/gameserver/data/HTMLData;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/data/HTMLData;
        10: aload_0
        11: invokespecial #13                 // Method java/nio/file/SimpleFileVisitor."<init>":()V
        14: return
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/HTMLData$1;
            0      15     1 this$0   Lext/mods/gameserver/data/HTMLData;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public java.nio.file.FileVisitResult visitFile(java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes);
    descriptor: (Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: getstatic     #19                 // Field ext/mods/gameserver/data/HTMLData.HTML_ROOT:Ljava/nio/file/Path;
         3: aload_1
         4: invokeinterface #25,  2           // InterfaceMethod java/nio/file/Path.relativize:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
         9: invokeinterface #31,  1           // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
        14: ldc           #35                 // String \\
        16: ldc           #37                 // String /
        18: invokevirtual #39                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        21: astore_3
        22: aload_3
        23: ldc           #45                 // String .htm
        25: invokevirtual #47                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        28: ifne          44
        31: aload_3
        32: ldc           #51                 // String .html
        34: invokevirtual #47                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        37: ifne          44
        40: getstatic     #53                 // Field java/nio/file/FileVisitResult.CONTINUE:Ljava/nio/file/FileVisitResult;
        43: areturn
        44: invokestatic  #59                 // Method java/util/concurrent/ForkJoinPool.commonPool:()Ljava/util/concurrent/ForkJoinPool;
        47: aload_0
        48: aload_3
        49: aload_1
        50: invokedynamic #65,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/data/HTMLData$1;Ljava/lang/String;Ljava/nio/file/Path;)Ljava/lang/Runnable;
        55: invokevirtual #69                 // Method java/util/concurrent/ForkJoinPool.execute:(Ljava/lang/Runnable;)V
        58: getstatic     #53                 // Field java/nio/file/FileVisitResult.CONTINUE:Ljava/nio/file/FileVisitResult;
        61: areturn
      LineNumberTable:
        line 76: 0
        line 77: 22
        line 78: 40
        line 80: 44
        line 92: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/data/HTMLData$1;
            0      62     1  file   Ljava/nio/file/Path;
            0      62     2 attrs   Ljava/nio/file/attribute/BasicFileAttributes;
           22      40     3 relative   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class java/lang/String ]

  public java.nio.file.FileVisitResult visitFile(java.lang.Object, java.nio.file.attribute.BasicFileAttributes) throws java.io.IOException;
    descriptor: (Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #26                 // class java/nio/file/Path
         5: aload_2
         6: invokevirtual #73                 // Method visitFile:(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
         9: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/HTMLData$1;
    Exceptions:
      throws java.io.IOException
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
      <no name>                      synthetic
}
Signature: #122                         // Ljava/nio/file/SimpleFileVisitor<Ljava/nio/file/Path;>;
SourceFile: "HTMLData.java"
EnclosingMethod: #20.#126               // ext.mods.gameserver.data.HTMLData.doLoadHtml
NestHost: class ext/mods/gameserver/data/HTMLData
BootstrapMethods:
  0: #136 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #130 ()V
      #131 REF_invokeVirtual ext/mods/gameserver/data/HTMLData$1.lambda$visitFile$0:(Ljava/lang/String;Ljava/nio/file/Path;)V
      #130 ()V
  1: #143 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #134 html/\u0001
InnerClasses:
  #8;                                     // class ext/mods/gameserver/data/HTMLData$1
  public static final #154= #150 of #152; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
