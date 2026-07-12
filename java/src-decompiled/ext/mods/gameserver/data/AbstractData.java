// Bytecode for: ext.mods.gameserver.data.AbstractData
// File: ext\mods\gameserver\data\AbstractData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/AbstractData.class
  Last modified 9 de jul de 2026; size 1635 bytes
  MD5 checksum 849390f2dfaaf2e7a96a724894837bfc
  Compiled from "AbstractData.java"
public abstract class ext.mods.gameserver.data.AbstractData
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/gameserver/data/AbstractData
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 8, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/AbstractData.BASE_DATA_PATH:Ljava/nio/file/Path;
   #8 = Class              #10            // ext/mods/gameserver/data/AbstractData
   #9 = NameAndType        #11:#12        // BASE_DATA_PATH:Ljava/nio/file/Path;
  #10 = Utf8               ext/mods/gameserver/data/AbstractData
  #11 = Utf8               BASE_DATA_PATH
  #12 = Utf8               Ljava/nio/file/Path;
  #13 = InterfaceMethodref #14.#15        // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #14 = Class              #16            // java/nio/file/Path
  #15 = NameAndType        #17:#18        // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #16 = Utf8               java/nio/file/Path
  #17 = Utf8               resolve
  #18 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #19 = InterfaceMethodref #14.#20        // java/nio/file/Path.resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
  #20 = NameAndType        #17:#21        // resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
  #21 = Utf8               (Ljava/nio/file/Path;)Ljava/nio/file/Path;
  #22 = Methodref          #23.#24        // java/nio/file/Files.readAllBytes:(Ljava/nio/file/Path;)[B
  #23 = Class              #25            // java/nio/file/Files
  #24 = NameAndType        #26:#27        // readAllBytes:(Ljava/nio/file/Path;)[B
  #25 = Utf8               java/nio/file/Files
  #26 = Utf8               readAllBytes
  #27 = Utf8               (Ljava/nio/file/Path;)[B
  #28 = Class              #29            // java/io/IOException
  #29 = Utf8               java/io/IOException
  #30 = Class              #31            // ext/mods/gameserver/data/DataException
  #31 = Utf8               ext/mods/gameserver/data/DataException
  #32 = Methodref          #30.#33        // ext/mods/gameserver/data/DataException."<init>":(Ljava/lang/Throwable;)V
  #33 = NameAndType        #5:#34         // "<init>":(Ljava/lang/Throwable;)V
  #34 = Utf8               (Ljava/lang/Throwable;)V
  #35 = Fieldref           #36.#37        // ext/mods/Config.CHARSET:Ljava/nio/charset/Charset;
  #36 = Class              #38            // ext/mods/Config
  #37 = NameAndType        #39:#40        // CHARSET:Ljava/nio/charset/Charset;
  #38 = Utf8               ext/mods/Config
  #39 = Utf8               CHARSET
  #40 = Utf8               Ljava/nio/charset/Charset;
  #41 = Methodref          #8.#42         // ext/mods/gameserver/data/AbstractData.readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
  #42 = NameAndType        #43:#44        // readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
  #43 = Utf8               readString
  #44 = Utf8               (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
  #45 = Class              #46            // java/lang/String
  #46 = Utf8               java/lang/String
  #47 = Methodref          #8.#24         // ext/mods/gameserver/data/AbstractData.readAllBytes:(Ljava/nio/file/Path;)[B
  #48 = Methodref          #45.#49        // java/lang/String."<init>":([BLjava/nio/charset/Charset;)V
  #49 = NameAndType        #5:#50         // "<init>":([BLjava/nio/charset/Charset;)V
  #50 = Utf8               ([BLjava/nio/charset/Charset;)V
  #51 = Fieldref           #36.#52        // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
  #52 = NameAndType        #53:#12        // DATA_PATH:Ljava/nio/file/Path;
  #53 = Utf8               DATA_PATH
  #54 = Utf8               Code
  #55 = Utf8               LineNumberTable
  #56 = Utf8               LocalVariableTable
  #57 = Utf8               this
  #58 = Utf8               Lext/mods/gameserver/data/AbstractData;
  #59 = Utf8               load
  #60 = Utf8               file
  #61 = Utf8               Ljava/lang/String;
  #62 = Utf8               e
  #63 = Utf8               Ljava/io/IOException;
  #64 = Utf8               path
  #65 = Utf8               StackMapTable
  #66 = Utf8               Exceptions
  #67 = Utf8               (Ljava/nio/file/Path;)Ljava/lang/String;
  #68 = Utf8               charset
  #69 = Utf8               <clinit>
  #70 = Utf8               SourceFile
  #71 = Utf8               AbstractData.java
{
  public static final java.nio.file.Path BASE_DATA_PATH;
    descriptor: Ljava/nio/file/Path;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.data.AbstractData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/AbstractData;

  public abstract void load();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  protected java.nio.file.Path resolve(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/nio/file/Path;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #7                  // Field BASE_DATA_PATH:Ljava/nio/file/Path;
         3: aload_1
         4: invokeinterface #13,  2           // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
         9: areturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/AbstractData;
            0      10     1  file   Ljava/lang/String;

  protected java.nio.file.Path resolve(java.nio.file.Path);
    descriptor: (Ljava/nio/file/Path;)Ljava/nio/file/Path;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #7                  // Field BASE_DATA_PATH:Ljava/nio/file/Path;
         3: aload_1
         4: invokeinterface #19,  2           // InterfaceMethod java/nio/file/Path.resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
         9: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/AbstractData;
            0      10     1  file   Ljava/nio/file/Path;

  protected byte[] readAllBytes(java.nio.file.Path) throws ext.mods.gameserver.data.DataException;
    descriptor: (Ljava/nio/file/Path;)[B
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: invokestatic  #22                 // Method java/nio/file/Files.readAllBytes:(Ljava/nio/file/Path;)[B
         4: areturn
         5: astore_2
         6: new           #30                 // class ext/mods/gameserver/data/DataException
         9: dup
        10: aload_2
        11: invokespecial #32                 // Method ext/mods/gameserver/data/DataException."<init>":(Ljava/lang/Throwable;)V
        14: athrow
      Exception table:
         from    to  target type
             0     4     5   Class java/io/IOException
      LineNumberTable:
        line 45: 0
        line 47: 5
        line 49: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            6       9     2     e   Ljava/io/IOException;
            0      15     0  this   Lext/mods/gameserver/data/AbstractData;
            0      15     1  path   Ljava/nio/file/Path;
      StackMapTable: number_of_entries = 1
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/io/IOException ]
    Exceptions:
      throws ext.mods.gameserver.data.DataException

  protected java.lang.String readString(java.nio.file.Path) throws ext.mods.gameserver.data.DataException;
    descriptor: (Ljava/nio/file/Path;)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: getstatic     #35                 // Field ext/mods/Config.CHARSET:Ljava/nio/charset/Charset;
         5: invokevirtual #41                 // Method readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
         8: areturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/data/AbstractData;
            0       9     1  path   Ljava/nio/file/Path;
    Exceptions:
      throws ext.mods.gameserver.data.DataException

  protected java.lang.String readString(java.nio.file.Path, java.nio.charset.Charset) throws ext.mods.gameserver.data.DataException;
    descriptor: (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=3, args_size=3
         0: new           #45                 // class java/lang/String
         3: dup
         4: aload_0
         5: aload_1
         6: invokevirtual #47                 // Method readAllBytes:(Ljava/nio/file/Path;)[B
         9: aload_2
        10: invokespecial #48                 // Method java/lang/String."<init>":([BLjava/nio/charset/Charset;)V
        13: areturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/AbstractData;
            0      14     1  path   Ljava/nio/file/Path;
            0      14     2 charset   Ljava/nio/charset/Charset;
    Exceptions:
      throws ext.mods.gameserver.data.DataException

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #51                 // Field ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
         3: putstatic     #7                  // Field BASE_DATA_PATH:Ljava/nio/file/Path;
         6: return
      LineNumberTable:
        line 67: 0
        line 68: 6
}
SourceFile: "AbstractData.java"
