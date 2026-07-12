// Bytecode for: ext.mods.gameserver.data.cache.CrestCache$DdsFilter
// File: ext\mods\gameserver\data\cache\CrestCache$DdsFilter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/cache/CrestCache$DdsFilter.class
  Last modified 9 de jul de 2026; size 1346 bytes
  MD5 checksum 89ce1783057201287bbc4de4e0bafdd1
  Compiled from "CrestCache.java"
class ext.mods.gameserver.data.cache.CrestCache$DdsFilter extends java.lang.Object implements java.nio.file.DirectoryStream$Filter<java.nio.file.Path>
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #35                         // ext/mods/gameserver/data/cache/CrestCache$DdsFilter
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 3, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = InterfaceMethodref #8.#9          // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
   #8 = Class              #10            // java/nio/file/Path
   #9 = NameAndType        #11:#12        // getFileName:()Ljava/nio/file/Path;
  #10 = Utf8               java/nio/file/Path
  #11 = Utf8               getFileName
  #12 = Utf8               ()Ljava/nio/file/Path;
  #13 = InterfaceMethodref #8.#14         // java/nio/file/Path.toString:()Ljava/lang/String;
  #14 = NameAndType        #15:#16        // toString:()Ljava/lang/String;
  #15 = Utf8               toString
  #16 = Utf8               ()Ljava/lang/String;
  #17 = String             #18            // Crest_
  #18 = Utf8               Crest_
  #19 = Methodref          #20.#21        // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #20 = Class              #22            // java/lang/String
  #21 = NameAndType        #23:#24        // startsWith:(Ljava/lang/String;)Z
  #22 = Utf8               java/lang/String
  #23 = Utf8               startsWith
  #24 = Utf8               (Ljava/lang/String;)Z
  #25 = String             #26            // LargeCrest_
  #26 = Utf8               LargeCrest_
  #27 = String             #28            // AllyCrest_
  #28 = Utf8               AllyCrest_
  #29 = String             #30            // .dds
  #30 = Utf8               .dds
  #31 = Methodref          #20.#32        // java/lang/String.endsWith:(Ljava/lang/String;)Z
  #32 = NameAndType        #33:#24        // endsWith:(Ljava/lang/String;)Z
  #33 = Utf8               endsWith
  #34 = Methodref          #35.#36        // ext/mods/gameserver/data/cache/CrestCache$DdsFilter.accept:(Ljava/nio/file/Path;)Z
  #35 = Class              #37            // ext/mods/gameserver/data/cache/CrestCache$DdsFilter
  #36 = NameAndType        #38:#39        // accept:(Ljava/nio/file/Path;)Z
  #37 = Utf8               ext/mods/gameserver/data/cache/CrestCache$DdsFilter
  #38 = Utf8               accept
  #39 = Utf8               (Ljava/nio/file/Path;)Z
  #40 = Class              #41            // java/nio/file/DirectoryStream$Filter
  #41 = Utf8               java/nio/file/DirectoryStream$Filter
  #42 = Utf8               Code
  #43 = Utf8               LineNumberTable
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               this
  #46 = Utf8               Lext/mods/gameserver/data/cache/CrestCache$DdsFilter;
  #47 = Utf8               file
  #48 = Utf8               Ljava/nio/file/Path;
  #49 = Utf8               fileName
  #50 = Utf8               Ljava/lang/String;
  #51 = Utf8               StackMapTable
  #52 = Utf8               (Ljava/lang/Object;)Z
  #53 = Utf8               Exceptions
  #54 = Class              #55            // java/io/IOException
  #55 = Utf8               java/io/IOException
  #56 = Utf8               MethodParameters
  #57 = Utf8               Signature
  #58 = Utf8               Ljava/lang/Object;Ljava/nio/file/DirectoryStream$Filter<Ljava/nio/file/Path;>;
  #59 = Utf8               SourceFile
  #60 = Utf8               CrestCache.java
  #61 = Utf8               NestHost
  #62 = Class              #63            // ext/mods/gameserver/data/cache/CrestCache
  #63 = Utf8               ext/mods/gameserver/data/cache/CrestCache
  #64 = Utf8               InnerClasses
  #65 = Utf8               DdsFilter
  #66 = Class              #67            // java/nio/file/DirectoryStream
  #67 = Utf8               java/nio/file/DirectoryStream
  #68 = Utf8               Filter
{
  public boolean accept(java.nio.file.Path);
    descriptor: (Ljava/nio/file/Path;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokeinterface #7,  1            // InterfaceMethod java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
         6: invokeinterface #13,  1           // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
        11: astore_2
        12: aload_2
        13: ldc           #17                 // String Crest_
        15: invokevirtual #19                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        18: ifne          39
        21: aload_2
        22: ldc           #25                 // String LargeCrest_
        24: invokevirtual #19                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        27: ifne          39
        30: aload_2
        31: ldc           #27                 // String AllyCrest_
        33: invokevirtual #19                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        36: ifeq          52
        39: aload_2
        40: ldc           #29                 // String .dds
        42: invokevirtual #31                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        45: ifeq          52
        48: iconst_1
        49: goto          53
        52: iconst_0
        53: ireturn
      LineNumberTable:
        line 176: 0
        line 178: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/data/cache/CrestCache$DdsFilter;
            0      54     1  file   Ljava/nio/file/Path;
           12      42     2 fileName   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class java/lang/String ]
        frame_type = 12 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean accept(java.lang.Object) throws java.io.IOException;
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #8                  // class java/nio/file/Path
         5: invokevirtual #34                 // Method accept:(Ljava/nio/file/Path;)Z
         8: ireturn
      LineNumberTable:
        line 171: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/data/cache/CrestCache$DdsFilter;
    Exceptions:
      throws java.io.IOException
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #58                          // Ljava/lang/Object;Ljava/nio/file/DirectoryStream$Filter<Ljava/nio/file/Path;>;
SourceFile: "CrestCache.java"
NestHost: class ext/mods/gameserver/data/cache/CrestCache
InnerClasses:
  public static #68= #40 of #66;          // Filter=class java/nio/file/DirectoryStream$Filter of class java/nio/file/DirectoryStream
