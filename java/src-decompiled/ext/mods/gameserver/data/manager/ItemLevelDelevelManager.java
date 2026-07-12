// Bytecode for: ext.mods.gameserver.data.manager.ItemLevelDelevelManager
// File: ext\mods\gameserver\data\manager\ItemLevelDelevelManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/ItemLevelDelevelManager.class
  Last modified 9 de jul de 2026; size 4846 bytes
  MD5 checksum 8616d2b626f0f685423089604377ce17
  Compiled from "ItemLevelDelevelManager.java"
public final class ext.mods.gameserver.data.manager.ItemLevelDelevelManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/ItemLevelDelevelManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 10, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager._itemConfigs:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/ItemLevelDelevelManager
   #12 = NameAndType        #14:#15       // _itemConfigs:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/ItemLevelDelevelManager
   #14 = Utf8               _itemConfigs
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/Map.clear:()V
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/Map
   #23 = Utf8               clear
   #24 = Fieldref           #11.#25       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.ITEMS_FILE:Ljava/lang/String;
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
   #58 = String             #59           // ItemLevelDelevel_
   #59 = Utf8               ItemLevelDelevel_
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
   #84 = Fieldref           #11.#85       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.LOGGER:Lext/mods/commons/logging/CLogger;
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
   #96 = String             #97           // 0,0
   #97 = Utf8               0,0
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
  #108 = Methodref          #11.#109      // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.parseInt:(Ljava/lang/String;I)I
  #109 = NameAndType        #80:#110      // parseInt:(Ljava/lang/String;I)I
  #110 = Utf8               (Ljava/lang/String;I)I
  #111 = Methodref          #77.#112      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #112 = NameAndType        #113:#114     // valueOf:(I)Ljava/lang/Integer;
  #113 = Utf8               valueOf
  #114 = Utf8               (I)Ljava/lang/Integer;
  #115 = Class              #116          // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
  #116 = Utf8               ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
  #117 = Methodref          #115.#118     // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig."<init>":(II)V
  #118 = NameAndType        #5:#119       // "<init>":(II)V
  #119 = Utf8               (II)V
  #120 = InterfaceMethodref #20.#121      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #121 = NameAndType        #122:#123     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Utf8               put
  #123 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #124 = String             #125          // ItemLevelDelevelManager: loaded {} item configurations.
  #125 = Utf8               ItemLevelDelevelManager: loaded {} item configurations.
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
  #147 = Fieldref           #115.#148     // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig.levelAdd:I
  #148 = NameAndType        #149:#150     // levelAdd:I
  #149 = Utf8               levelAdd
  #150 = Utf8               I
  #151 = Fieldref           #115.#152     // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig.levelRemove:I
  #152 = NameAndType        #153:#150     // levelRemove:I
  #153 = Utf8               levelRemove
  #154 = Methodref          #155.#156     // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #155 = Class              #157          // ext/mods/gameserver/data/xml/PlayerLevelData
  #156 = NameAndType        #158:#159     // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #157 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
  #158 = Utf8               getInstance
  #159 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #160 = Methodref          #155.#161     // ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
  #161 = NameAndType        #162:#67      // getRealMaxLevel:()I
  #162 = Utf8               getRealMaxLevel
  #163 = Fieldref           #164.#165     // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
  #164 = Class              #166          // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$SingletonHolder
  #165 = NameAndType        #167:#168     // INSTANCE:Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
  #166 = Utf8               ext/mods/gameserver/data/manager/ItemLevelDelevelManager$SingletonHolder
  #167 = Utf8               INSTANCE
  #168 = Utf8               Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
  #169 = Methodref          #170.#171     // java/lang/Class.getName:()Ljava/lang/String;
  #170 = Class              #172          // java/lang/Class
  #171 = NameAndType        #173:#75      // getName:()Ljava/lang/String;
  #172 = Utf8               java/lang/Class
  #173 = Utf8               getName
  #174 = Methodref          #91.#175      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #175 = NameAndType        #5:#176       // "<init>":(Ljava/lang/String;)V
  #176 = Utf8               (Ljava/lang/String;)V
  #177 = Fieldref           #29.#178      // ext/mods/Config.CONFIG_PATH:Ljava/nio/file/Path;
  #178 = NameAndType        #179:#180     // CONFIG_PATH:Ljava/nio/file/Path;
  #179 = Utf8               CONFIG_PATH
  #180 = Utf8               Ljava/nio/file/Path;
  #181 = String             #182          // items.properties
  #182 = Utf8               items.properties
  #183 = InterfaceMethodref #184.#185     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #184 = Class              #186          // java/nio/file/Path
  #185 = NameAndType        #187:#188     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #186 = Utf8               java/nio/file/Path
  #187 = Utf8               resolve
  #188 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #189 = InterfaceMethodref #184.#190     // java/nio/file/Path.toString:()Ljava/lang/String;
  #190 = NameAndType        #191:#75      // toString:()Ljava/lang/String;
  #191 = Utf8               toString
  #192 = Utf8               PREFIX
  #193 = Utf8               ConstantValue
  #194 = Utf8               Signature
  #195 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig;>;
  #196 = Utf8               Code
  #197 = Utf8               LineNumberTable
  #198 = Utf8               LocalVariableTable
  #199 = Utf8               this
  #200 = Utf8               itemId
  #201 = Utf8               e
  #202 = Utf8               Ljava/lang/NumberFormatException;
  #203 = Utf8               idStr
  #204 = Utf8               value
  #205 = Utf8               parts
  #206 = Utf8               [Ljava/lang/String;
  #207 = Utf8               key
  #208 = Utf8               props
  #209 = Utf8               Lext/mods/commons/config/ExProperties;
  #210 = Utf8               Ljava/lang/Exception;
  #211 = Utf8               StackMapTable
  #212 = Class              #206          // "[Ljava/lang/String;"
  #213 = Utf8               s
  #214 = Utf8               defaultVal
  #215 = Utf8               isConfigured
  #216 = Utf8               (I)Z
  #217 = Utf8               getLevelAdd
  #218 = Utf8               (I)I
  #219 = Utf8               cfg
  #220 = Utf8               Lext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig;
  #221 = Utf8               getLevelRemove
  #222 = Utf8               getConfig
  #223 = Utf8               (I)Lext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig;
  #224 = Utf8               getMaxLevel
  #225 = Utf8               ()Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
  #226 = Utf8               <clinit>
  #227 = Utf8               SourceFile
  #228 = Utf8               ItemLevelDelevelManager.java
  #229 = Utf8               NestMembers
  #230 = Utf8               InnerClasses
  #231 = Utf8               LevelDelevelConfig
  #232 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.data.manager.ItemLevelDelevelManager();
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
            0      20     0  this   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;

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
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
            0      14     1 itemId   I

  public int getLevelAdd(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _itemConfigs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #143,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #115                // class ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
        16: astore_2
        17: aload_2
        18: ifnull        28
        21: aload_2
        22: getfield      #147                // Field ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig.levelAdd:I
        25: goto          29
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 112: 0
        line 113: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
            0      30     1 itemId   I
           17      13     2   cfg   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getLevelRemove(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _itemConfigs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #143,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #115                // class ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
        16: astore_2
        17: aload_2
        18: ifnull        28
        21: aload_2
        22: getfield      #151                // Field ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig.levelRemove:I
        25: goto          29
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 122: 0
        line 123: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
            0      30     1 itemId   I
           17      13     2   cfg   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.data.manager.ItemLevelDelevelManager$LevelDelevelConfig getConfig(int);
    descriptor: (I)Lext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _itemConfigs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #143,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #115                // class ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
        16: areturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
            0      17     1 itemId   I

  public int getMaxLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #154                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         3: invokevirtual #160                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
         6: ireturn
      LineNumberTable:
        line 140: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;

  public static ext.mods.gameserver.data.manager.ItemLevelDelevelManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #163                // Field ext/mods/gameserver/data/manager/ItemLevelDelevelManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
         3: areturn
      LineNumberTable:
        line 145: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #91                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/ItemLevelDelevelManager
         6: invokevirtual #169                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #174                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #84                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: getstatic     #177                // Field ext/mods/Config.CONFIG_PATH:Ljava/nio/file/Path;
        18: ldc           #181                // String items.properties
        20: invokeinterface #183,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        25: invokeinterface #189,  1          // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
        30: putstatic     #24                 // Field ITEMS_FILE:Ljava/lang/String;
        33: return
      LineNumberTable:
        line 36: 0
        line 37: 15
}
SourceFile: "ItemLevelDelevelManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
  ext/mods/gameserver/data/manager/ItemLevelDelevelManager$SingletonHolder
InnerClasses:
  public static final #231= #115 of #11;  // LevelDelevelConfig=class ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig of class ext/mods/gameserver/data/manager/ItemLevelDelevelManager
