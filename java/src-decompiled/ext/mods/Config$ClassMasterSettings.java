// Bytecode for: ext.mods.Config$ClassMasterSettings
// File: ext\mods\Config$ClassMasterSettings.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Config$ClassMasterSettings.class
  Last modified 9 de jul de 2026; size 2913 bytes
  MD5 checksum 1f99475e459b4b63242a58d8768949c8
  Compiled from "Config.java"
public final class ext.mods.Config$ClassMasterSettings
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/Config$ClassMasterSettings
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/HashMap.newHashMap:(I)Ljava/util/HashMap;
    #8 = Class              #10           // java/util/HashMap
    #9 = NameAndType        #11:#12       // newHashMap:(I)Ljava/util/HashMap;
   #10 = Utf8               java/util/HashMap
   #11 = Utf8               newHashMap
   #12 = Utf8               (I)Ljava/util/HashMap;
   #13 = Fieldref           #14.#15       // ext/mods/Config$ClassMasterSettings._allowedClassChange:Ljava/util/Map;
   #14 = Class              #16           // ext/mods/Config$ClassMasterSettings
   #15 = NameAndType        #17:#18       // _allowedClassChange:Ljava/util/Map;
   #16 = Utf8               ext/mods/Config$ClassMasterSettings
   #17 = Utf8               _allowedClassChange
   #18 = Utf8               Ljava/util/Map;
   #19 = Fieldref           #14.#20       // ext/mods/Config$ClassMasterSettings._claimItems:Ljava/util/Map;
   #20 = NameAndType        #21:#18       // _claimItems:Ljava/util/Map;
   #21 = Utf8               _claimItems
   #22 = Fieldref           #14.#23       // ext/mods/Config$ClassMasterSettings._rewardItems:Ljava/util/Map;
   #23 = NameAndType        #24:#18       // _rewardItems:Ljava/util/Map;
   #24 = Utf8               _rewardItems
   #25 = Methodref          #26.#27       // java/lang/String.trim:()Ljava/lang/String;
   #26 = Class              #28           // java/lang/String
   #27 = NameAndType        #29:#30       // trim:()Ljava/lang/String;
   #28 = Utf8               java/lang/String
   #29 = Utf8               trim
   #30 = Utf8               ()Ljava/lang/String;
   #31 = Methodref          #14.#32       // ext/mods/Config$ClassMasterSettings.parseConfigLine:(Ljava/lang/String;)V
   #32 = NameAndType        #33:#34       // parseConfigLine:(Ljava/lang/String;)V
   #33 = Utf8               parseConfigLine
   #34 = Utf8               (Ljava/lang/String;)V
   #35 = Class              #36           // java/util/StringTokenizer
   #36 = Utf8               java/util/StringTokenizer
   #37 = String             #38           // ;
   #38 = Utf8               ;
   #39 = Methodref          #35.#40       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #40 = NameAndType        #5:#41        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #41 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #42 = Methodref          #35.#43       // java/util/StringTokenizer.hasMoreTokens:()Z
   #43 = NameAndType        #44:#45       // hasMoreTokens:()Z
   #44 = Utf8               hasMoreTokens
   #45 = Utf8               ()Z
   #46 = Methodref          #35.#47       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #47 = NameAndType        #48:#30       // nextToken:()Ljava/lang/String;
   #48 = Utf8               nextToken
   #49 = Methodref          #50.#51       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #50 = Class              #52           // java/lang/Integer
   #51 = NameAndType        #53:#54       // parseInt:(Ljava/lang/String;)I
   #52 = Utf8               java/lang/Integer
   #53 = Utf8               parseInt
   #54 = Utf8               (Ljava/lang/String;)I
   #55 = Methodref          #50.#56       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #56 = NameAndType        #57:#58       // valueOf:(I)Ljava/lang/Integer;
   #57 = Utf8               valueOf
   #58 = Utf8               (I)Ljava/lang/Integer;
   #59 = Methodref          #60.#61       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #60 = Class              #62           // java/lang/Boolean
   #61 = NameAndType        #57:#63       // valueOf:(Z)Ljava/lang/Boolean;
   #62 = Utf8               java/lang/Boolean
   #63 = Utf8               (Z)Ljava/lang/Boolean;
   #64 = InterfaceMethodref #65.#66       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #65 = Class              #67           // java/util/Map
   #66 = NameAndType        #68:#69       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #67 = Utf8               java/util/Map
   #68 = Utf8               put
   #69 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #70 = Class              #71           // java/util/ArrayList
   #71 = Utf8               java/util/ArrayList
   #72 = Methodref          #70.#3        // java/util/ArrayList."<init>":()V
   #73 = String             #74           // [],
   #74 = Utf8               [],
   #75 = String             #76           // ()
   #76 = Utf8               ()
   #77 = Class              #78           // ext/mods/gameserver/model/holder/IntIntHolder
   #78 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #79 = Methodref          #77.#80       // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
   #80 = NameAndType        #5:#81        // "<init>":(II)V
   #81 = Utf8               (II)V
   #82 = InterfaceMethodref #83.#84       // java/util/List.add:(Ljava/lang/Object;)Z
   #83 = Class              #85           // java/util/List
   #84 = NameAndType        #86:#87       // add:(Ljava/lang/Object;)Z
   #85 = Utf8               java/util/List
   #86 = Utf8               add
   #87 = Utf8               (Ljava/lang/Object;)Z
   #88 = InterfaceMethodref #65.#89       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #89 = NameAndType        #90:#87       // containsKey:(Ljava/lang/Object;)Z
   #90 = Utf8               containsKey
   #91 = InterfaceMethodref #65.#92       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #92 = NameAndType        #93:#94       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #93 = Utf8               get
   #94 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #95 = Methodref          #60.#96       // java/lang/Boolean.booleanValue:()Z
   #96 = NameAndType        #97:#45       // booleanValue:()Z
   #97 = Utf8               booleanValue
   #98 = Utf8               Signature
   #99 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;
  #100 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;>;
  #101 = Utf8               Code
  #102 = Utf8               LineNumberTable
  #103 = Utf8               LocalVariableTable
  #104 = Utf8               this
  #105 = Utf8               Lext/mods/Config$ClassMasterSettings;
  #106 = Utf8               configLine
  #107 = Utf8               Ljava/lang/String;
  #108 = Utf8               StackMapTable
  #109 = Utf8               st3
  #110 = Utf8               Ljava/util/StringTokenizer;
  #111 = Utf8               st2
  #112 = Utf8               job
  #113 = Utf8               I
  #114 = Utf8               items
  #115 = Utf8               Ljava/util/List;
  #116 = Utf8               st
  #117 = Utf8               LocalVariableTypeTable
  #118 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #119 = Utf8               isAllowed
  #120 = Utf8               (I)Z
  #121 = Utf8               getRewardItems
  #122 = Utf8               (I)Ljava/util/List;
  #123 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #124 = Utf8               getRequiredItems
  #125 = Utf8               SourceFile
  #126 = Utf8               Config.java
  #127 = Utf8               NestHost
  #128 = Class              #129          // ext/mods/Config
  #129 = Utf8               ext/mods/Config
  #130 = Utf8               InnerClasses
  #131 = Utf8               ClassMasterSettings
{
  public boolean isAllowed(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _allowedClassChange:Ljava/util/Map;
         4: ifnonnull     9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #13                 // Field _allowedClassChange:Ljava/util/Map;
        13: iload_1
        14: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        17: invokeinterface #88,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        22: ifeq          45
        25: aload_0
        26: getfield      #13                 // Field _allowedClassChange:Ljava/util/Map;
        29: iload_1
        30: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        33: invokeinterface #91,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        38: checkcast     #60                 // class java/lang/Boolean
        41: invokevirtual #95                 // Method java/lang/Boolean.booleanValue:()Z
        44: ireturn
        45: iconst_0
        46: ireturn
      LineNumberTable:
        line 3539: 0
        line 3540: 7
        line 3542: 9
        line 3543: 25
        line 3545: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/Config$ClassMasterSettings;
            0      47     1   job   I
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 35 /* same */

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> getRewardItems(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field _rewardItems:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #91,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #83                 // class java/util/List
        16: areturn
      LineNumberTable:
        line 3550: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/Config$ClassMasterSettings;
            0      17     1   job   I
    Signature: #123                         // (I)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> getRequiredItems(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _claimItems:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #91,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #83                 // class java/util/List
        16: areturn
      LineNumberTable:
        line 3555: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/Config$ClassMasterSettings;
            0      17     1   job   I
    Signature: #123                         // (I)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
}
SourceFile: "Config.java"
NestHost: class ext/mods/Config
InnerClasses:
  public static final #131= #14 of #128;  // ClassMasterSettings=class ext/mods/Config$ClassMasterSettings of class ext/mods/Config
