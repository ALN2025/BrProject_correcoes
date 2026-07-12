// Bytecode for: ext.mods.commons.data.xml.IXmlReader$1
// File: ext\mods\commons\data\xml\IXmlReader$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/data/xml/IXmlReader$1.class
  Last modified 9 de jul de 2026; size 1589 bytes
  MD5 checksum b91d202b95eebc83f26afd78606c946a
  Compiled from "IXmlReader.java"
class ext.mods.commons.data.xml.IXmlReader$1 extends java.nio.file.SimpleFileVisitor<java.nio.file.Path>
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/data/xml/IXmlReader$1
  super_class: #14                        // java/nio/file/SimpleFileVisitor
  interfaces: 0, fields: 1, methods: 3, attributes: 5
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/commons/data/xml/IXmlReader$1.val$pathsToParse:Ljava/util/List;
   #2 = Class              #4             // ext/mods/commons/data/xml/IXmlReader$1
   #3 = NameAndType        #5:#6          // val$pathsToParse:Ljava/util/List;
   #4 = Utf8               ext/mods/commons/data/xml/IXmlReader$1
   #5 = Utf8               val$pathsToParse
   #6 = Utf8               Ljava/util/List;
   #7 = Methodref          #8.#9          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #8 = Class              #10            // java/util/Objects
   #9 = NameAndType        #11:#12        // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #10 = Utf8               java/util/Objects
  #11 = Utf8               requireNonNull
  #12 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #13 = Methodref          #14.#15        // java/nio/file/SimpleFileVisitor."<init>":()V
  #14 = Class              #16            // java/nio/file/SimpleFileVisitor
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/nio/file/SimpleFileVisitor
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = InterfaceMethodref #20.#21        // java/util/List.add:(Ljava/lang/Object;)Z
  #20 = Class              #22            // java/util/List
  #21 = NameAndType        #23:#24        // add:(Ljava/lang/Object;)Z
  #22 = Utf8               java/util/List
  #23 = Utf8               add
  #24 = Utf8               (Ljava/lang/Object;)Z
  #25 = Fieldref           #26.#27        // java/nio/file/FileVisitResult.CONTINUE:Ljava/nio/file/FileVisitResult;
  #26 = Class              #28            // java/nio/file/FileVisitResult
  #27 = NameAndType        #29:#30        // CONTINUE:Ljava/nio/file/FileVisitResult;
  #28 = Utf8               java/nio/file/FileVisitResult
  #29 = Utf8               CONTINUE
  #30 = Utf8               Ljava/nio/file/FileVisitResult;
  #31 = Class              #32            // java/nio/file/Path
  #32 = Utf8               java/nio/file/Path
  #33 = Methodref          #2.#34         // ext/mods/commons/data/xml/IXmlReader$1.visitFile:(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
  #34 = NameAndType        #35:#36        // visitFile:(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
  #35 = Utf8               visitFile
  #36 = Utf8               (Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
  #37 = Utf8               (Lext/mods/commons/data/xml/IXmlReader;Ljava/util/List;)V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               Lext/mods/commons/data/xml/IXmlReader$1;
  #43 = Utf8               this$0
  #44 = Utf8               Lext/mods/commons/data/xml/IXmlReader;
  #45 = Utf8               MethodParameters
  #46 = Utf8               file
  #47 = Utf8               Ljava/nio/file/Path;
  #48 = Utf8               attrs
  #49 = Utf8               Ljava/nio/file/attribute/BasicFileAttributes;
  #50 = Utf8               (Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
  #51 = Utf8               Exceptions
  #52 = Class              #53            // java/io/IOException
  #53 = Utf8               java/io/IOException
  #54 = Utf8               Signature
  #55 = Utf8               Ljava/nio/file/SimpleFileVisitor<Ljava/nio/file/Path;>;
  #56 = Utf8               SourceFile
  #57 = Utf8               IXmlReader.java
  #58 = Utf8               EnclosingMethod
  #59 = Class              #60            // ext/mods/commons/data/xml/IXmlReader
  #60 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #61 = NameAndType        #62:#63        // parseFile:(Ljava/nio/file/Path;ZZZ)V
  #62 = Utf8               parseFile
  #63 = Utf8               (Ljava/nio/file/Path;ZZZ)V
  #64 = Utf8               NestHost
  #65 = Utf8               InnerClasses
{
  final java.util.List val$pathsToParse;
    descriptor: Ljava/util/List;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.data.xml.IXmlReader$1(ext.mods.commons.data.xml.IXmlReader, java.util.List);
    descriptor: (Lext/mods/commons/data/xml/IXmlReader;Ljava/util/List;)V
    flags: (0x0000)
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$pathsToParse:Ljava/util/List;
         5: aload_1
         6: dup
         7: invokestatic  #7                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        10: pop
        11: pop
        12: aload_0
        13: invokespecial #13                 // Method java/nio/file/SimpleFileVisitor."<init>":()V
        16: return
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/data/xml/IXmlReader$1;
            0      17     1 this$0   Lext/mods/commons/data/xml/IXmlReader;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic

  public java.nio.file.FileVisitResult visitFile(java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes);
    descriptor: (Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #1                  // Field val$pathsToParse:Ljava/util/List;
         4: aload_1
         5: invokeinterface #19,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: getstatic     #25                 // Field java/nio/file/FileVisitResult.CONTINUE:Ljava/nio/file/FileVisitResult;
        14: areturn
      LineNumberTable:
        line 101: 0
        line 102: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader$1;
            0      15     1  file   Ljava/nio/file/Path;
            0      15     2 attrs   Ljava/nio/file/attribute/BasicFileAttributes;

  public java.nio.file.FileVisitResult visitFile(java.lang.Object, java.nio.file.attribute.BasicFileAttributes) throws java.io.IOException;
    descriptor: (Ljava/lang/Object;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #31                 // class java/nio/file/Path
         5: aload_2
         6: invokevirtual #33                 // Method visitFile:(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
         9: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/xml/IXmlReader$1;
    Exceptions:
      throws java.io.IOException
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
      <no name>                      synthetic
}
Signature: #55                          // Ljava/nio/file/SimpleFileVisitor<Ljava/nio/file/Path;>;
SourceFile: "IXmlReader.java"
EnclosingMethod: #59.#61                // ext.mods.commons.data.xml.IXmlReader.parseFile
NestHost: class ext/mods/commons/data/xml/IXmlReader
InnerClasses:
  #2;                                     // class ext/mods/commons/data/xml/IXmlReader$1
