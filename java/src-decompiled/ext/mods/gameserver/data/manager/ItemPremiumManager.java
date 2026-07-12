// Bytecode for: ext.mods.gameserver.data.manager.ItemPremiumManager
// File: ext\mods\gameserver\data\manager\ItemPremiumManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/ItemPremiumManager.class
  Last modified 9 de jul de 2026; size 4242 bytes
  MD5 checksum acf632c9ee9274841acb4428a60ee123
  Compiled from "ItemPremiumManager.java"
public final class ext.mods.gameserver.data.manager.ItemPremiumManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/ItemPremiumManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/ItemPremiumManager._itemConfigs:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/ItemPremiumManager
   #12 = NameAndType        #14:#15       // _itemConfigs:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/ItemPremiumManager
   #14 = Utf8               _itemConfigs
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/manager/ItemPremiumManager.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/Map.clear:()V
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/Map
   #23 = Utf8               clear
   #24 = Fieldref           #11.#25       // ext/mods/gameserver/data/manager/ItemPremiumManager.ITEMS_FILE:Ljava/lang/String;
   #25 = NameAndType        #26:#27       // ITEMS_FILE:Ljava/lang/String;
   #26 = Utf8               ITEMS_FILE
   #27 = Utf8               Ljava/lang/String;
   #28 = Methodref          #29.#30       // ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
   #29 = Class              #31           // ext/mods/Config
   #30 = NameAndType        #32:#33       // initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
   #31 = Utf8               ext/mods/Config
   #32 = Utf8               initProperties
   #33 = Utf8               (Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
   #34 = Methodref          #35.#36       // ext/mods/commons/config/ExProperties.stringPropertyNames:()Ljava/util/Set;
   #35 = Class              #37           // ext/mods/commons/config/ExProperties
   #36 = NameAndType        #38:#39       // stringPropertyNames:()Ljava/util/Set;
   #37 = Utf8               ext/mods/commons/config/ExProperties
   #38 = Utf8               stringPropertyNames
   #39 = Utf8               ()Ljava/util/Set;
   #40 = InterfaceMethodref #41.#42       // java/util/Set.iterator:()Ljava/util/Iterator;
   #41 = Class              #43           // java/util/Set
   #42 = NameAndType        #44:#45       // iterator:()Ljava/util/Iterator;
   #43 = Utf8               java/util/Set
   #44 = Utf8               iterator
   #45 = Utf8               ()Ljava/util/Iterator;
   #46 = InterfaceMethodref #47.#48       // java/util/Iterator.hasNext:()Z
   #47 = Class              #49           // java/util/Iterator
   #48 = NameAndType        #50:#51       // hasNext:()Z
   #49 = Utf8               java/util/Iterator
   #50 = Utf8               hasNext
   #51 = Utf8               ()Z
   #52 = InterfaceMethodref #47.#53       // java/util/Iterator.next:()Ljava/lang/Object;
   #53 = NameAndType        #54:#55       // next:()Ljava/lang/Object;
   #54 = Utf8               next
   #55 = Utf8               ()Ljava/lang/Object;
   #56 = Class              #57           // java/lang/String
   #57 = Utf8               java/lang/String
   #58 = String             #59           // ItemPremium_
   #59 = Utf8               ItemPremium_
   #60 = Methodref          #56.#61       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #61 = NameAndType        #62:#63       // startsWith:(Ljava/lang/String;)Z
   #62 = Utf8               startsWith
   #63 = Utf8               (Ljava/lang/String;)Z
   #64 = Methodref          #56.#65       // java/lang/String.length:()I
   #65 = NameAndType        #66:#67       // length:()I
   #66 = Utf8               length
   #67 = Utf8               ()I
   #68 = Methodref          #56.#69       // java/lang/String.substring:(I)Ljava/lang/String;
   #69 = NameAndType        #70:#71       // substring:(I)Ljava/lang/String;
   #70 = Utf8               substring
   #71 = Utf8               (I)Ljava/lang/String;
   #72 = Methodref          #56.#73       // java/lang/String.trim:()Ljava/lang/String;
   #73 = NameAndType        #74:#75       // trim:()Ljava/lang/String;
   #74 = Utf8               trim
   #75 = Utf8               ()Ljava/lang/String;
   #76 = Methodref          #77.#78       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #77 = Class              #79           // java/lang/Integer
   #78 = NameAndType        #80:#81       // parseInt:(Ljava/lang/String;)I
   #79 = Utf8               java/lang/Integer
   #80 = Utf8               parseInt
   #81 = Utf8               (Ljava/lang/String;)I
   #82 = Class              #83           // java/lang/NumberFormatException
   #83 = Utf8               java/lang/NumberFormatException
   #84 = Fieldref           #11.#85       // ext/mods/gameserver/data/manager/ItemPremiumManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #85 = NameAndType        #86:#87       // LOGGER:Lext/mods/commons/logging/CLogger;
   #86 = Utf8               LOGGER
   #87 = Utf8               Lext/mods/commons/logging/CLogger;
   #88 = String             #89           // Invalid item ID in items.properties: {}
   #89 = Utf8               Invalid item ID in items.properties: {}
   #90 = Methodref          #91.#92       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #91 = Class              #93           // ext/mods/commons/logging/CLogger
   #92 = NameAndType        #94:#95       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #93 = Utf8               ext/mods/commons/logging/CLogger
   #94 = Utf8               warn
   #95 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #96 = String             #97           // 0,0,0
   #97 = Utf8               0,0,0
   #98 = Methodref          #35.#99       // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #99 = NameAndType        #100:#101     // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #100 = Utf8               getProperty
  #101 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #102 = String             #103          // [,;]+
  #103 = Utf8               [,;]+
  #104 = Methodref          #56.#105      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #105 = NameAndType        #106:#107     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #106 = Utf8               split
  #107 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #108 = Methodref          #11.#109      // ext/mods/gameserver/data/manager/ItemPremiumManager.parseInt:(Ljava/lang/String;I)I
  #109 = NameAndType        #80:#110      // parseInt:(Ljava/lang/String;I)I
  #110 = Utf8               (Ljava/lang/String;I)I
  #111 = Methodref          #77.#112      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #112 = NameAndType        #113:#114     // valueOf:(I)Ljava/lang/Integer;
  #113 = Utf8               valueOf
  #114 = Utf8               (I)Ljava/lang/Integer;
  #115 = Class              #116          // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
  #116 = Utf8               ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
  #117 = Methodref          #115.#118     // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig."<init>":(III)V
  #118 = NameAndType        #5:#119       // "<init>":(III)V
  #119 = Utf8               (III)V
  #120 = InterfaceMethodref #20.#121      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #121 = NameAndType        #122:#123     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Utf8               put
  #123 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #124 = String             #125          // ItemPremiumManager: loaded {} item configurations.
  #125 = Utf8               ItemPremiumManager: loaded {} item configurations.
  #126 = InterfaceMethodref #20.#127      // java/util/Map.size:()I
  #127 = NameAndType        #128:#67      // size:()I
  #128 = Utf8               size
  #129 = Methodref          #91.#130      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #130 = NameAndType        #131:#95      // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #131 = Utf8               info
  #132 = Class              #133          // java/lang/Exception
  #133 = Utf8               java/lang/Exception
  #134 = String             #135          // Failed to load items.properties: {}
  #135 = Utf8               Failed to load items.properties: {}
  #136 = Methodref          #132.#137     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #137 = NameAndType        #138:#75      // getMessage:()Ljava/lang/String;
  #138 = Utf8               getMessage
  #139 = InterfaceMethodref #20.#140      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #140 = NameAndType        #141:#142     // containsKey:(Ljava/lang/Object;)Z
  #141 = Utf8               containsKey
  #142 = Utf8               (Ljava/lang/Object;)Z
  #143 = InterfaceMethodref #20.#144      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #144 = NameAndType        #145:#146     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #145 = Utf8               get
  #146 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #147 = Fieldref           #148.#149     // ext/mods/gameserver/data/manager/ItemPremiumManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/ItemPremiumManager;
  #148 = Class              #150          // ext/mods/gameserver/data/manager/ItemPremiumManager$SingletonHolder
  #149 = NameAndType        #151:#152     // INSTANCE:Lext/mods/gameserver/data/manager/ItemPremiumManager;
  #150 = Utf8               ext/mods/gameserver/data/manager/ItemPremiumManager$SingletonHolder
  #151 = Utf8               INSTANCE
  #152 = Utf8               Lext/mods/gameserver/data/manager/ItemPremiumManager;
  #153 = Methodref          #154.#155     // java/lang/Class.getName:()Ljava/lang/String;
  #154 = Class              #156          // java/lang/Class
  #155 = NameAndType        #157:#75      // getName:()Ljava/lang/String;
  #156 = Utf8               java/lang/Class
  #157 = Utf8               getName
  #158 = Methodref          #91.#159      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #159 = NameAndType        #5:#160       // "<init>":(Ljava/lang/String;)V
  #160 = Utf8               (Ljava/lang/String;)V
  #161 = Fieldref           #29.#162      // ext/mods/Config.CONFIG_PATH:Ljava/nio/file/Path;
  #162 = NameAndType        #163:#164     // CONFIG_PATH:Ljava/nio/file/Path;
  #163 = Utf8               CONFIG_PATH
  #164 = Utf8               Ljava/nio/file/Path;
  #165 = String             #166          // items.properties
  #166 = Utf8               items.properties
  #167 = InterfaceMethodref #168.#169     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #168 = Class              #170          // java/nio/file/Path
  #169 = NameAndType        #171:#172     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #170 = Utf8               java/nio/file/Path
  #171 = Utf8               resolve
  #172 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #173 = InterfaceMethodref #168.#174     // java/nio/file/Path.toString:()Ljava/lang/String;
  #174 = NameAndType        #175:#75      // toString:()Ljava/lang/String;
  #175 = Utf8               toString
  #176 = Utf8               PREFIX
  #177 = Utf8               ConstantValue
  #178 = Utf8               Signature
  #179 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;>;
  #180 = Utf8               Code
  #181 = Utf8               LineNumberTable
  #182 = Utf8               LocalVariableTable
  #183 = Utf8               this
  #184 = Utf8               itemId
  #185 = Utf8               I
  #186 = Utf8               e
  #187 = Utf8               Ljava/lang/NumberFormatException;
  #188 = Utf8               idStr
  #189 = Utf8               value
  #190 = Utf8               parts
  #191 = Utf8               [Ljava/lang/String;
  #192 = Utf8               minutes
  #193 = Utf8               hours
  #194 = Utf8               days
  #195 = Utf8               key
  #196 = Utf8               props
  #197 = Utf8               Lext/mods/commons/config/ExProperties;
  #198 = Utf8               Ljava/lang/Exception;
  #199 = Utf8               StackMapTable
  #200 = Class              #191          // "[Ljava/lang/String;"
  #201 = Utf8               s
  #202 = Utf8               defaultVal
  #203 = Utf8               isConfigured
  #204 = Utf8               (I)Z
  #205 = Utf8               getConfig
  #206 = Utf8               (I)Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
  #207 = Utf8               getInstance
  #208 = Utf8               ()Lext/mods/gameserver/data/manager/ItemPremiumManager;
  #209 = Utf8               <clinit>
  #210 = Utf8               SourceFile
  #211 = Utf8               ItemPremiumManager.java
  #212 = Utf8               NestMembers
  #213 = Utf8               InnerClasses
  #214 = Utf8               PremiumConfig
  #215 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.data.manager.ItemPremiumManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _itemConfigs:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 43: 0
        line 40: 4
        line 44: 15
        line 45: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/ItemPremiumManager;

  public boolean isConfigured(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _itemConfigs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #139,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/ItemPremiumManager;
            0      14     1 itemId   I

  public ext.mods.gameserver.data.manager.ItemPremiumManager$PremiumConfig getConfig(int);
    descriptor: (I)Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _itemConfigs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #143,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #115                // class ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
        16: areturn
      LineNumberTable:
        line 106: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/ItemPremiumManager;
            0      17     1 itemId   I

  public static ext.mods.gameserver.data.manager.ItemPremiumManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/ItemPremiumManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #147                // Field ext/mods/gameserver/data/manager/ItemPremiumManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/ItemPremiumManager;
         3: areturn
      LineNumberTable:
        line 111: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #91                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/ItemPremiumManager
         6: invokevirtual #153                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #158                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #84                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: getstatic     #161                // Field ext/mods/Config.CONFIG_PATH:Ljava/nio/file/Path;
        18: ldc           #165                // String items.properties
        20: invokeinterface #167,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        25: invokeinterface #173,  1          // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
        30: putstatic     #24                 // Field ITEMS_FILE:Ljava/lang/String;
        33: return
      LineNumberTable:
        line 36: 0
        line 37: 15
}
SourceFile: "ItemPremiumManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
  ext/mods/gameserver/data/manager/ItemPremiumManager$SingletonHolder
InnerClasses:
  public static final #214= #115 of #11;  // PremiumConfig=class ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig of class ext/mods/gameserver/data/manager/ItemPremiumManager
