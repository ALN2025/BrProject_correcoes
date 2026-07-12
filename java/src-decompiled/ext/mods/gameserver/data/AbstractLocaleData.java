// Bytecode for: ext.mods.gameserver.data.AbstractLocaleData
// File: ext\mods\gameserver\data\AbstractLocaleData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/AbstractLocaleData.class
  Last modified 9 de jul de 2026; size 1899 bytes
  MD5 checksum 9d04f1e21608562e1f789af4946969ca
  Compiled from "AbstractLocaleData.java"
public abstract class ext.mods.gameserver.data.AbstractLocaleData extends ext.mods.gameserver.data.AbstractData
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #20                         // ext/mods/gameserver/data/AbstractLocaleData
  super_class: #2                         // ext/mods/gameserver/data/AbstractData
  interfaces: 0, fields: 1, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/data/AbstractData."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/data/AbstractData
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/data/AbstractData
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/util/Locale.toLanguageTag:()Ljava/lang/String;
   #8 = Class              #10            // java/util/Locale
   #9 = NameAndType        #11:#12        // toLanguageTag:()Ljava/lang/String;
  #10 = Utf8               java/util/Locale
  #11 = Utf8               toLanguageTag
  #12 = Utf8               ()Ljava/lang/String;
  #13 = Methodref          #14.#15        // java/lang/String.replace:(CC)Ljava/lang/String;
  #14 = Class              #16            // java/lang/String
  #15 = NameAndType        #17:#18        // replace:(CC)Ljava/lang/String;
  #16 = Utf8               java/lang/String
  #17 = Utf8               replace
  #18 = Utf8               (CC)Ljava/lang/String;
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/data/AbstractLocaleData.BASE_LOCALE_PATH:Ljava/nio/file/Path;
  #20 = Class              #22            // ext/mods/gameserver/data/AbstractLocaleData
  #21 = NameAndType        #23:#24        // BASE_LOCALE_PATH:Ljava/nio/file/Path;
  #22 = Utf8               ext/mods/gameserver/data/AbstractLocaleData
  #23 = Utf8               BASE_LOCALE_PATH
  #24 = Utf8               Ljava/nio/file/Path;
  #25 = Methodref          #20.#26        // ext/mods/gameserver/data/AbstractLocaleData.resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
  #26 = NameAndType        #27:#28        // resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
  #27 = Utf8               resolve
  #28 = Utf8               (Ljava/nio/file/Path;)Ljava/nio/file/Path;
  #29 = Methodref          #20.#30        // ext/mods/gameserver/data/AbstractLocaleData.toLocaleFolder:(Ljava/util/Locale;)Ljava/lang/String;
  #30 = NameAndType        #31:#32        // toLocaleFolder:(Ljava/util/Locale;)Ljava/lang/String;
  #31 = Utf8               toLocaleFolder
  #32 = Utf8               (Ljava/util/Locale;)Ljava/lang/String;
  #33 = InterfaceMethodref #34.#35        // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #34 = Class              #36            // java/nio/file/Path
  #35 = NameAndType        #27:#37        // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #36 = Utf8               java/nio/file/Path
  #37 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #38 = InterfaceMethodref #34.#26        // java/nio/file/Path.resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
  #39 = Class              #40            // ext/mods/gameserver/data/LocalizedString
  #40 = Utf8               ext/mods/gameserver/data/LocalizedString
  #41 = Methodref          #39.#42        // ext/mods/gameserver/data/LocalizedString."<init>":(Ljava/lang/String;Lext/mods/gameserver/data/AbstractLocaleData;)V
  #42 = NameAndType        #5:#43         // "<init>":(Ljava/lang/String;Lext/mods/gameserver/data/AbstractLocaleData;)V
  #43 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/data/AbstractLocaleData;)V
  #44 = String             #45            // ext.mods.gameserver.data.AbstractLocaleData.BASE_LOCALE_PATH
  #45 = Utf8               ext.mods.gameserver.data.AbstractLocaleData.BASE_LOCALE_PATH
  #46 = String             #47            // locale
  #47 = Utf8               locale
  #48 = Methodref          #49.#50        // java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #49 = Class              #51            // java/lang/System
  #50 = NameAndType        #52:#53        // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #51 = Utf8               java/lang/System
  #52 = Utf8               getProperty
  #53 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #54 = InterfaceMethodref #34.#55        // java/nio/file/Path.of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #55 = NameAndType        #56:#57        // of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #56 = Utf8               of
  #57 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #58 = Utf8               Code
  #59 = Utf8               LineNumberTable
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               this
  #62 = Utf8               Lext/mods/gameserver/data/AbstractLocaleData;
  #63 = Utf8               Ljava/util/Locale;
  #64 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/nio/file/Path;
  #65 = Utf8               file
  #66 = Utf8               Ljava/lang/String;
  #67 = Utf8               (Ljava/util/Locale;Ljava/nio/file/Path;)Ljava/nio/file/Path;
  #68 = Utf8               getLocalizedString
  #69 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/data/LocalizedString;
  #70 = Utf8               key
  #71 = Utf8               get
  #72 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #73 = Utf8               <clinit>
  #74 = Utf8               SourceFile
  #75 = Utf8               AbstractLocaleData.java
{
  public static final java.nio.file.Path BASE_LOCALE_PATH;
    descriptor: Ljava/nio/file/Path;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.data.AbstractLocaleData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/data/AbstractData."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/AbstractLocaleData;

  protected static java.lang.String toLocaleFolder(java.util.Locale);
    descriptor: (Ljava/util/Locale;)Ljava/lang/String;
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method java/util/Locale.toLanguageTag:()Ljava/lang/String;
         4: bipush        45
         6: bipush        95
         8: invokevirtual #13                 // Method java/lang/String.replace:(CC)Ljava/lang/String;
        11: areturn
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0 locale   Ljava/util/Locale;

  protected java.nio.file.Path resolve(java.util.Locale, java.lang.String);
    descriptor: (Ljava/util/Locale;Ljava/lang/String;)Ljava/nio/file/Path;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getstatic     #19                 // Field BASE_LOCALE_PATH:Ljava/nio/file/Path;
         4: invokevirtual #25                 // Method resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
         7: aload_1
         8: invokestatic  #29                 // Method toLocaleFolder:(Ljava/util/Locale;)Ljava/lang/String;
        11: invokeinterface #33,  2           // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        16: aload_2
        17: invokeinterface #33,  2           // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        22: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/AbstractLocaleData;
            0      23     1 locale   Ljava/util/Locale;
            0      23     2  file   Ljava/lang/String;

  protected java.nio.file.Path resolve(java.util.Locale, java.nio.file.Path);
    descriptor: (Ljava/util/Locale;Ljava/nio/file/Path;)Ljava/nio/file/Path;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getstatic     #19                 // Field BASE_LOCALE_PATH:Ljava/nio/file/Path;
         4: invokevirtual #25                 // Method resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
         7: aload_1
         8: invokestatic  #29                 // Method toLocaleFolder:(Ljava/util/Locale;)Ljava/lang/String;
        11: invokeinterface #33,  2           // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        16: aload_2
        17: invokeinterface #38,  2           // InterfaceMethod java/nio/file/Path.resolve:(Ljava/nio/file/Path;)Ljava/nio/file/Path;
        22: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/AbstractLocaleData;
            0      23     1 locale   Ljava/util/Locale;
            0      23     2  file   Ljava/nio/file/Path;

  public ext.mods.gameserver.data.LocalizedString getLocalizedString(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/data/LocalizedString;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: new           #39                 // class ext/mods/gameserver/data/LocalizedString
         3: dup
         4: aload_1
         5: aload_0
         6: invokespecial #41                 // Method ext/mods/gameserver/data/LocalizedString."<init>":(Ljava/lang/String;Lext/mods/gameserver/data/AbstractLocaleData;)V
         9: areturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/AbstractLocaleData;
            0      10     1   key   Ljava/lang/String;

  public abstract java.lang.String get(java.util.Locale, java.lang.String);
    descriptor: (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: ldc           #44                 // String ext.mods.gameserver.data.AbstractLocaleData.BASE_LOCALE_PATH
         2: ldc           #46                 // String locale
         4: invokestatic  #48                 // Method java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         7: iconst_0
         8: anewarray     #14                 // class java/lang/String
        11: invokestatic  #54                 // InterfaceMethod java/nio/file/Path.of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        14: putstatic     #19                 // Field BASE_LOCALE_PATH:Ljava/nio/file/Path;
        17: return
      LineNumberTable:
        line 52: 0
        line 53: 17
}
SourceFile: "AbstractLocaleData.java"
