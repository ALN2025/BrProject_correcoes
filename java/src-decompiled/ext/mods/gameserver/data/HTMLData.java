// Bytecode for: ext.mods.gameserver.data.HTMLData
// File: ext\mods\gameserver\data\HTMLData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/HTMLData.class
  Last modified 9 de jul de 2026; size 4231 bytes
  MD5 checksum c9050644c949601a3ac6a6757a9960e3
  Compiled from "HTMLData.java"
public final class ext.mods.gameserver.data.HTMLData extends ext.mods.gameserver.data.AbstractLocaleData
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/HTMLData
  super_class: #2                         // ext/mods/gameserver/data/AbstractLocaleData
  interfaces: 0, fields: 3, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/data/AbstractLocaleData."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/data/AbstractLocaleData
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/data/AbstractLocaleData
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/HTMLData._data:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/HTMLData
   #12 = NameAndType        #14:#15       // _data:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/HTMLData
   #14 = Utf8               _data
   #15 = Utf8               Ljava/util/Map;
   #16 = InterfaceMethodref #17.#18       // java/util/Map.clear:()V
   #17 = Class              #19           // java/util/Map
   #18 = NameAndType        #20:#6        // clear:()V
   #19 = Utf8               java/util/Map
   #20 = Utf8               clear
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/HTMLData.doLoadHtml:()V
   #22 = NameAndType        #23:#6        // doLoadHtml:()V
   #23 = Utf8               doLoadHtml
   #24 = Fieldref           #11.#25       // ext/mods/gameserver/data/HTMLData.LOGGER:Lext/mods/commons/logging/CLogger;
   #25 = NameAndType        #26:#27       // LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = Utf8               LOGGER
   #27 = Utf8               Lext/mods/commons/logging/CLogger;
   #28 = String             #29           // HTMLData has been cleared ({} entries).
   #29 = Utf8               HTMLData has been cleared ({} entries).
   #30 = Class              #31           // java/lang/Object
   #31 = Utf8               java/lang/Object
   #32 = InterfaceMethodref #17.#33       // java/util/Map.size:()I
   #33 = NameAndType        #34:#35       // size:()I
   #34 = Utf8               size
   #35 = Utf8               ()I
   #36 = Methodref          #37.#38       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #37 = Class              #39           // java/lang/Integer
   #38 = NameAndType        #40:#41       // valueOf:(I)Ljava/lang/Integer;
   #39 = Utf8               java/lang/Integer
   #40 = Utf8               valueOf
   #41 = Utf8               (I)Ljava/lang/Integer;
   #42 = Methodref          #43.#44       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #43 = Class              #45           // ext/mods/commons/logging/CLogger
   #44 = NameAndType        #46:#47       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #45 = Utf8               ext/mods/commons/logging/CLogger
   #46 = Utf8               info
   #47 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #48 = Fieldref           #11.#49       // ext/mods/gameserver/data/HTMLData.HTML_ROOT:Ljava/nio/file/Path;
   #49 = NameAndType        #50:#51       // HTML_ROOT:Ljava/nio/file/Path;
   #50 = Utf8               HTML_ROOT
   #51 = Utf8               Ljava/nio/file/Path;
   #52 = Class              #53           // java/nio/file/LinkOption
   #53 = Utf8               java/nio/file/LinkOption
   #54 = Methodref          #55.#56       // java/nio/file/Files.isDirectory:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #55 = Class              #57           // java/nio/file/Files
   #56 = NameAndType        #58:#59       // isDirectory:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #57 = Utf8               java/nio/file/Files
   #58 = Utf8               isDirectory
   #59 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #60 = String             #61           // HTML folder not found: {}
   #61 = Utf8               HTML folder not found: {}
   #62 = Methodref          #43.#63       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #63 = NameAndType        #64:#47       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #64 = Utf8               warn
   #65 = Class              #66           // ext/mods/gameserver/data/HTMLData$1
   #66 = Utf8               ext/mods/gameserver/data/HTMLData$1
   #67 = Methodref          #65.#68       // ext/mods/gameserver/data/HTMLData$1."<init>":(Lext/mods/gameserver/data/HTMLData;)V
   #68 = NameAndType        #5:#69        // "<init>":(Lext/mods/gameserver/data/HTMLData;)V
   #69 = Utf8               (Lext/mods/gameserver/data/HTMLData;)V
   #70 = Methodref          #55.#71       // java/nio/file/Files.walkFileTree:(Ljava/nio/file/Path;Ljava/nio/file/FileVisitor;)Ljava/nio/file/Path;
   #71 = NameAndType        #72:#73       // walkFileTree:(Ljava/nio/file/Path;Ljava/nio/file/FileVisitor;)Ljava/nio/file/Path;
   #72 = Utf8               walkFileTree
   #73 = Utf8               (Ljava/nio/file/Path;Ljava/nio/file/FileVisitor;)Ljava/nio/file/Path;
   #74 = Class              #75           // java/io/IOException
   #75 = Utf8               java/io/IOException
   #76 = Methodref          #74.#77       // java/io/IOException.printStackTrace:()V
   #77 = NameAndType        #78:#6        // printStackTrace:()V
   #78 = Utf8               printStackTrace
   #79 = Methodref          #11.#80       // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #80 = NameAndType        #81:#82       // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #81 = Utf8               getHtm
   #82 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #84 = Class              #86           // ext/mods/gameserver/model/actor/Player
   #85 = NameAndType        #87:#88       // getLocale:()Ljava/util/Locale;
   #86 = Utf8               ext/mods/gameserver/model/actor/Player
   #87 = Utf8               getLocale
   #88 = Utf8               ()Ljava/util/Locale;
   #89 = InterfaceMethodref #17.#90       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #90 = NameAndType        #91:#92       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #91 = Utf8               get
   #92 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #93 = Class              #94           // java/lang/String
   #94 = Utf8               java/lang/String
   #95 = InvokeDynamic      #0:#96        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #96 = NameAndType        #97:#98       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #97 = Utf8               makeConcatWithConstants
   #98 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #99 = Methodref          #11.#100      // ext/mods/gameserver/data/HTMLData.exists:(Ljava/util/Locale;Ljava/lang/String;)Z
  #100 = NameAndType        #101:#102     // exists:(Ljava/util/Locale;Ljava/lang/String;)Z
  #101 = Utf8               exists
  #102 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Z
  #103 = InterfaceMethodref #17.#104      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #104 = NameAndType        #105:#106     // containsKey:(Ljava/lang/Object;)Z
  #105 = Utf8               containsKey
  #106 = Utf8               (Ljava/lang/Object;)Z
  #107 = Methodref          #11.#108      // ext/mods/gameserver/data/HTMLData.toHtmlPath:(Ljava/lang/String;)Ljava/nio/file/Path;
  #108 = NameAndType        #109:#110     // toHtmlPath:(Ljava/lang/String;)Ljava/nio/file/Path;
  #109 = Utf8               toHtmlPath
  #110 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #111 = Methodref          #55.#112      // java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
  #112 = NameAndType        #101:#59      // exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
  #113 = String             #114          // html/
  #114 = Utf8               html/
  #115 = Methodref          #93.#116      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #116 = NameAndType        #117:#118     // startsWith:(Ljava/lang/String;)Z
  #117 = Utf8               startsWith
  #118 = Utf8               (Ljava/lang/String;)Z
  #119 = Methodref          #93.#120      // java/lang/String.length:()I
  #120 = NameAndType        #121:#35      // length:()I
  #121 = Utf8               length
  #122 = Methodref          #93.#123      // java/lang/String.substring:(I)Ljava/lang/String;
  #123 = NameAndType        #124:#125     // substring:(I)Ljava/lang/String;
  #124 = Utf8               substring
  #125 = Utf8               (I)Ljava/lang/String;
  #126 = InterfaceMethodref #127.#128     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #127 = Class              #129          // java/nio/file/Path
  #128 = NameAndType        #130:#110     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #129 = Utf8               java/nio/file/Path
  #130 = Utf8               resolve
  #131 = Fieldref           #132.#133     // ext/mods/gameserver/data/HTMLData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/HTMLData;
  #132 = Class              #134          // ext/mods/gameserver/data/HTMLData$SingletonHolder
  #133 = NameAndType        #135:#136     // INSTANCE:Lext/mods/gameserver/data/HTMLData;
  #134 = Utf8               ext/mods/gameserver/data/HTMLData$SingletonHolder
  #135 = Utf8               INSTANCE
  #136 = Utf8               Lext/mods/gameserver/data/HTMLData;
  #137 = Methodref          #138.#139     // java/lang/Class.getName:()Ljava/lang/String;
  #138 = Class              #140          // java/lang/Class
  #139 = NameAndType        #141:#142     // getName:()Ljava/lang/String;
  #140 = Utf8               java/lang/Class
  #141 = Utf8               getName
  #142 = Utf8               ()Ljava/lang/String;
  #143 = Methodref          #43.#144      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #144 = NameAndType        #5:#145       // "<init>":(Ljava/lang/String;)V
  #145 = Utf8               (Ljava/lang/String;)V
  #146 = Fieldref           #11.#147      // ext/mods/gameserver/data/HTMLData.BASE_DATA_PATH:Ljava/nio/file/Path;
  #147 = NameAndType        #148:#51      // BASE_DATA_PATH:Ljava/nio/file/Path;
  #148 = Utf8               BASE_DATA_PATH
  #149 = String             #150          // html
  #150 = Utf8               html
  #151 = Utf8               Signature
  #152 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #153 = Utf8               Code
  #154 = Utf8               LineNumberTable
  #155 = Utf8               LocalVariableTable
  #156 = Utf8               this
  #157 = Utf8               load
  #158 = Utf8               reload
  #159 = Utf8               e
  #160 = Utf8               Ljava/io/IOException;
  #161 = Utf8               StackMapTable
  #162 = Utf8               locale
  #163 = Utf8               Ljava/util/Locale;
  #164 = Utf8               key
  #165 = Utf8               Ljava/lang/String;
  #166 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #167 = Utf8               player
  #168 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #169 = Utf8               file
  #170 = Utf8               result
  #171 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #172 = Utf8               relative
  #173 = Utf8               getInstance
  #174 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #175 = Utf8               <clinit>
  #176 = Utf8               SourceFile
  #177 = Utf8               HTMLData.java
  #178 = Utf8               NestMembers
  #179 = Utf8               BootstrapMethods
  #180 = String             #181          // <html><body>Not found file: \u0001</body></html>
  #181 = Utf8               <html><body>Not found file: \u0001</body></html>
  #182 = MethodHandle       6:#183        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #183 = Methodref          #184.#185     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #184 = Class              #186          // java/lang/invoke/StringConcatFactory
  #185 = NameAndType        #97:#187      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #186 = Utf8               java/lang/invoke/StringConcatFactory
  #187 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #188 = Utf8               InnerClasses
  #189 = Utf8               SingletonHolder
  #190 = Class              #191          // java/lang/invoke/MethodHandles$Lookup
  #191 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #192 = Class              #193          // java/lang/invoke/MethodHandles
  #193 = Utf8               java/lang/invoke/MethodHandles
  #194 = Utf8               Lookup
{
  public ext.mods.gameserver.data.HTMLData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/data/AbstractLocaleData."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _data:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 39: 0
        line 45: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/HTMLData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _data:Ljava/util/Map;
         4: invokeinterface #16,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #21                 // Method doLoadHtml:()V
        13: return
      LineNumberTable:
        line 50: 0
        line 51: 9
        line 52: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/HTMLData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: getstatic     #24                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc           #28                 // String HTMLData has been cleared ({} entries).
         5: iconst_1
         6: anewarray     #30                 // class java/lang/Object
         9: dup
        10: iconst_0
        11: aload_0
        12: getfield      #10                 // Field _data:Ljava/util/Map;
        15: invokeinterface #32,  1           // InterfaceMethod java/util/Map.size:()I
        20: invokestatic  #36                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: aastore
        24: invokevirtual #42                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        27: aload_0
        28: getfield      #10                 // Field _data:Ljava/util/Map;
        31: invokeinterface #16,  1           // InterfaceMethod java/util/Map.clear:()V
        36: aload_0
        37: invokevirtual #21                 // Method doLoadHtml:()V
        40: return
      LineNumberTable:
        line 56: 0
        line 57: 27
        line 58: 36
        line 59: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/data/HTMLData;

  public java.lang.String get(java.util.Locale, java.lang.String);
    descriptor: (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #79                 // Method getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/HTMLData;
            0       7     1 locale   Ljava/util/Locale;
            0       7     2   key   Ljava/lang/String;

  public java.lang.String getHtm(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
         5: aload_2
         6: invokevirtual #79                 // Method getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
         9: areturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/HTMLData;
            0      10     1 player   Lext/mods/gameserver/model/actor/Player;
            0      10     2  file   Ljava/lang/String;

  public java.lang.String getHtm(java.util.Locale, java.lang.String);
    descriptor: (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _data:Ljava/util/Map;
         4: aload_2
         5: invokeinterface #89,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #93                 // class java/lang/String
        13: astore_3
        14: aload_3
        15: ifnull        20
        18: aload_3
        19: areturn
        20: aload_2
        21: invokedynamic #95,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        26: areturn
      LineNumberTable:
        line 119: 0
        line 120: 14
        line 121: 18
        line 123: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/data/HTMLData;
            0      27     1 locale   Ljava/util/Locale;
            0      27     2  file   Ljava/lang/String;
           14      13     3 result   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/String ]

  public boolean exists(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
         5: aload_2
         6: invokevirtual #99                 // Method exists:(Ljava/util/Locale;Ljava/lang/String;)Z
         9: ireturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/HTMLData;
            0      10     1 player   Lext/mods/gameserver/model/actor/Player;
            0      10     2  file   Ljava/lang/String;

  public boolean exists(java.util.Locale, java.lang.String);
    descriptor: (Ljava/util/Locale;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _data:Ljava/util/Map;
         4: aload_2
         5: invokeinterface #103,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        10: ifeq          15
        13: iconst_1
        14: ireturn
        15: aload_2
        16: invokestatic  #107                // Method toHtmlPath:(Ljava/lang/String;)Ljava/nio/file/Path;
        19: iconst_0
        20: anewarray     #52                 // class java/nio/file/LinkOption
        23: invokestatic  #111                // Method java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
        26: ireturn
      LineNumberTable:
        line 133: 0
        line 134: 13
        line 136: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/data/HTMLData;
            0      27     1 locale   Ljava/util/Locale;
            0      27     2  file   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public static ext.mods.gameserver.data.HTMLData getInstance();
    descriptor: ()Lext/mods/gameserver/data/HTMLData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #131                // Field ext/mods/gameserver/data/HTMLData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/HTMLData;
         3: areturn
      LineNumberTable:
        line 147: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #43                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/HTMLData
         6: invokevirtual #137                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #143                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #24                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: getstatic     #146                // Field BASE_DATA_PATH:Ljava/nio/file/Path;
        18: ldc           #149                // String html
        20: invokeinterface #126,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        25: putstatic     #48                 // Field HTML_ROOT:Ljava/nio/file/Path;
        28: return
      LineNumberTable:
        line 41: 0
        line 43: 15
}
SourceFile: "HTMLData.java"
NestMembers:
  ext/mods/gameserver/data/HTMLData$SingletonHolder
  ext/mods/gameserver/data/HTMLData$1
BootstrapMethods:
  0: #182 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #180 <html><body>Not found file: \u0001</body></html>
InnerClasses:
  #65;                                    // class ext/mods/gameserver/data/HTMLData$1
  public static final #194= #190 of #192; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
