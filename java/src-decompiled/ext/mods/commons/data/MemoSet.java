// Bytecode for: ext.mods.commons.data.MemoSet
// File: ext\mods\commons\data\MemoSet.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/data/MemoSet.class
  Last modified 9 de jul de 2026; size 5571 bytes
  MD5 checksum 8166e33bf43bfc4681e9f3d1ee282434
  Compiled from "MemoSet.java"
public abstract class ext.mods.commons.data.MemoSet extends java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String>
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #14                         // ext/mods/commons/data/MemoSet
  super_class: #2                         // java/util/concurrent/ConcurrentHashMap
  interfaces: 0, fields: 1, methods: 22, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #2 = Class              #4            // java/util/concurrent/ConcurrentHashMap
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/concurrent/ConcurrentHashMap
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #2.#8         // java/util/concurrent/ConcurrentHashMap."<init>":(I)V
    #8 = NameAndType        #5:#9         // "<init>":(I)V
    #9 = Utf8               (I)V
   #10 = Methodref          #2.#11        // java/util/concurrent/ConcurrentHashMap."<init>":(Ljava/util/Map;)V
   #11 = NameAndType        #5:#12        // "<init>":(Ljava/util/Map;)V
   #12 = Utf8               (Ljava/util/Map;)V
   #13 = Methodref          #14.#15       // ext/mods/commons/data/MemoSet.onSet:(Ljava/lang/String;Ljava/lang/String;)V
   #14 = Class              #16           // ext/mods/commons/data/MemoSet
   #15 = NameAndType        #17:#18       // onSet:(Ljava/lang/String;Ljava/lang/String;)V
   #16 = Utf8               ext/mods/commons/data/MemoSet
   #17 = Utf8               onSet
   #18 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #19 = Methodref          #14.#20       // ext/mods/commons/data/MemoSet.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #20 = NameAndType        #21:#22       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #21 = Utf8               put
   #22 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #23 = Methodref          #24.#25       // java/lang/String.valueOf:(Z)Ljava/lang/String;
   #24 = Class              #26           // java/lang/String
   #25 = NameAndType        #27:#28       // valueOf:(Z)Ljava/lang/String;
   #26 = Utf8               java/lang/String
   #27 = Utf8               valueOf
   #28 = Utf8               (Z)Ljava/lang/String;
   #29 = Methodref          #14.#30       // ext/mods/commons/data/MemoSet.set:(Ljava/lang/String;Ljava/lang/String;)V
   #30 = NameAndType        #31:#18       // set:(Ljava/lang/String;Ljava/lang/String;)V
   #31 = Utf8               set
   #32 = Methodref          #24.#33       // java/lang/String.valueOf:(I)Ljava/lang/String;
   #33 = NameAndType        #27:#34       // valueOf:(I)Ljava/lang/String;
   #34 = Utf8               (I)Ljava/lang/String;
   #35 = Methodref          #24.#36       // java/lang/String.valueOf:(J)Ljava/lang/String;
   #36 = NameAndType        #27:#37       // valueOf:(J)Ljava/lang/String;
   #37 = Utf8               (J)Ljava/lang/String;
   #38 = Methodref          #24.#39       // java/lang/String.valueOf:(D)Ljava/lang/String;
   #39 = NameAndType        #27:#40       // valueOf:(D)Ljava/lang/String;
   #40 = Utf8               (D)Ljava/lang/String;
   #41 = Methodref          #24.#42       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #42 = NameAndType        #27:#43       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #43 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #44 = Methodref          #14.#45       // ext/mods/commons/data/MemoSet.onUnset:(Ljava/lang/String;)V
   #45 = NameAndType        #46:#47       // onUnset:(Ljava/lang/String;)V
   #46 = Utf8               onUnset
   #47 = Utf8               (Ljava/lang/String;)V
   #48 = Methodref          #14.#49       // ext/mods/commons/data/MemoSet.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #49 = NameAndType        #50:#51       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #50 = Utf8               remove
   #51 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #52 = Methodref          #14.#53       // ext/mods/commons/data/MemoSet.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #53 = NameAndType        #54:#51       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #54 = Utf8               get
   #55 = Methodref          #56.#57       // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #56 = Class              #58           // java/lang/Boolean
   #57 = NameAndType        #59:#60       // parseBoolean:(Ljava/lang/String;)Z
   #58 = Utf8               java/lang/Boolean
   #59 = Utf8               parseBoolean
   #60 = Utf8               (Ljava/lang/String;)Z
   #61 = Class              #62           // java/lang/IllegalArgumentException
   #62 = Utf8               java/lang/IllegalArgumentException
   #63 = InvokeDynamic      #0:#64        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #64 = NameAndType        #65:#66       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #65 = Utf8               makeConcatWithConstants
   #66 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #67 = Methodref          #61.#68       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #68 = NameAndType        #5:#47        // "<init>":(Ljava/lang/String;)V
   #69 = Methodref          #70.#71       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #70 = Class              #72           // java/lang/Integer
   #71 = NameAndType        #73:#74       // parseInt:(Ljava/lang/String;)I
   #72 = Utf8               java/lang/Integer
   #73 = Utf8               parseInt
   #74 = Utf8               (Ljava/lang/String;)I
   #75 = InvokeDynamic      #1:#64        // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #76 = Methodref          #77.#78       // java/lang/Long.parseLong:(Ljava/lang/String;)J
   #77 = Class              #79           // java/lang/Long
   #78 = NameAndType        #80:#81       // parseLong:(Ljava/lang/String;)J
   #79 = Utf8               java/lang/Long
   #80 = Utf8               parseLong
   #81 = Utf8               (Ljava/lang/String;)J
   #82 = InvokeDynamic      #2:#64        // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #83 = Methodref          #84.#85       // java/lang/Double.parseDouble:(Ljava/lang/String;)D
   #84 = Class              #86           // java/lang/Double
   #85 = NameAndType        #87:#88       // parseDouble:(Ljava/lang/String;)D
   #86 = Utf8               java/lang/Double
   #87 = Utf8               parseDouble
   #88 = Utf8               (Ljava/lang/String;)D
   #89 = InvokeDynamic      #3:#64        // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #90 = Methodref          #91.#92       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #91 = Class              #93           // java/lang/Enum
   #92 = NameAndType        #27:#94       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #93 = Utf8               java/lang/Enum
   #94 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #95 = Methodref          #96.#97       // java/lang/Class.getName:()Ljava/lang/String;
   #96 = Class              #98           // java/lang/Class
   #97 = NameAndType        #99:#100      // getName:()Ljava/lang/String;
   #98 = Utf8               java/lang/Class
   #99 = Utf8               getName
  #100 = Utf8               ()Ljava/lang/String;
  #101 = InvokeDynamic      #4:#64        // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #102 = Utf8               serialVersionUID
  #103 = Utf8               J
  #104 = Utf8               ConstantValue
  #105 = Long               1l
  #107 = Utf8               Code
  #108 = Utf8               LineNumberTable
  #109 = Utf8               LocalVariableTable
  #110 = Utf8               this
  #111 = Utf8               Lext/mods/commons/data/MemoSet;
  #112 = Utf8               size
  #113 = Utf8               I
  #114 = Utf8               m
  #115 = Utf8               Ljava/util/Map;
  #116 = Utf8               LocalVariableTypeTable
  #117 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #118 = Utf8               Signature
  #119 = Utf8               (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V
  #120 = Utf8               key
  #121 = Utf8               Ljava/lang/String;
  #122 = Utf8               value
  #123 = Utf8               (Ljava/lang/String;Z)V
  #124 = Utf8               Z
  #125 = Utf8               (Ljava/lang/String;I)V
  #126 = Utf8               (Ljava/lang/String;J)V
  #127 = Utf8               (Ljava/lang/String;D)V
  #128 = Utf8               D
  #129 = Utf8               (Ljava/lang/String;Ljava/lang/Enum;)V
  #130 = Utf8               Ljava/lang/Enum;
  #131 = Utf8               Ljava/lang/Enum<*>;
  #132 = Utf8               (Ljava/lang/String;Ljava/lang/Enum<*>;)V
  #133 = Utf8               unset
  #134 = Utf8               getBool
  #135 = Utf8               val
  #136 = Utf8               StackMapTable
  #137 = Utf8               (Ljava/lang/String;Z)Z
  #138 = Utf8               defaultValue
  #139 = Utf8               getInteger
  #140 = Utf8               (Ljava/lang/String;I)I
  #141 = Utf8               getLong
  #142 = Utf8               (Ljava/lang/String;J)J
  #143 = Utf8               getDouble
  #144 = Utf8               (Ljava/lang/String;D)D
  #145 = Utf8               getEnum
  #146 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
  #147 = Utf8               name
  #148 = Utf8               enumClass
  #149 = Utf8               Ljava/lang/Class;
  #150 = Utf8               Ljava/lang/Class<TE;>;
  #151 = Utf8               <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)TE;
  #152 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #153 = Utf8               TE;
  #154 = Utf8               <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/String;Ljava/lang/Class<TE;>;TE;)TE;
  #155 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/String;>;
  #156 = Utf8               SourceFile
  #157 = Utf8               MemoSet.java
  #158 = Utf8               BootstrapMethods
  #159 = String             #160          // MemoSet : Boolean value required, but found: \u0001 for key: \u0001.
  #160 = Utf8               MemoSet : Boolean value required, but found: \u0001 for key: \u0001.
  #161 = String             #162          // MemoSet : Integer value required, but found: \u0001 for key: \u0001.
  #162 = Utf8               MemoSet : Integer value required, but found: \u0001 for key: \u0001.
  #163 = String             #164          // MemoSet : Long value required, but found: \u0001 for key: \u0001.
  #164 = Utf8               MemoSet : Long value required, but found: \u0001 for key: \u0001.
  #165 = String             #166          // MemoSet : Double value required, but found: \u0001 for key: \u0001.
  #166 = Utf8               MemoSet : Double value required, but found: \u0001 for key: \u0001.
  #167 = String             #168          // Enum value of type \u0001 required, but found: \u0001.
  #168 = Utf8               Enum value of type \u0001 required, but found: \u0001.
  #169 = MethodHandle       6:#170        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #170 = Methodref          #171.#172     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #171 = Class              #173          // java/lang/invoke/StringConcatFactory
  #172 = NameAndType        #65:#174      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #173 = Utf8               java/lang/invoke/StringConcatFactory
  #174 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #175 = Utf8               InnerClasses
  #176 = Class              #177          // java/lang/invoke/MethodHandles$Lookup
  #177 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #178 = Class              #179          // java/lang/invoke/MethodHandles
  #179 = Utf8               java/lang/invoke/MethodHandles
  #180 = Utf8               Lookup
{
  protected abstract void onSet(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onUnset(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected ext.mods.commons.data.MemoSet();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
        line 39: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/data/MemoSet;

  protected ext.mods.commons.data.MemoSet(int);
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #7                  // Method java/util/concurrent/ConcurrentHashMap."<init>":(I)V
         5: return
      LineNumberTable:
        line 43: 0
        line 44: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/data/MemoSet;
            0       6     1  size   I

  protected ext.mods.commons.data.MemoSet(java.util.Map<java.lang.String, java.lang.String>);
    descriptor: (Ljava/util/Map;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #10                 // Method java/util/concurrent/ConcurrentHashMap."<init>":(Ljava/util/Map;)V
         5: return
      LineNumberTable:
        line 48: 0
        line 49: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/data/MemoSet;
            0       6     1     m   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     1     m   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
    Signature: #119                         // (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V

  public final void set(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #13                 // Method onSet:(Ljava/lang/String;Ljava/lang/String;)V
         6: aload_0
         7: aload_1
         8: aload_2
         9: invokevirtual #19                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        12: pop
        13: return
      LineNumberTable:
        line 53: 0
        line 55: 6
        line 56: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/MemoSet;
            0      14     1   key   Ljava/lang/String;
            0      14     2 value   Ljava/lang/String;

  public void set(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokestatic  #23                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
         6: invokevirtual #29                 // Method set:(Ljava/lang/String;Ljava/lang/String;)V
         9: return
      LineNumberTable:
        line 60: 0
        line 61: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/MemoSet;
            0      10     1   key   Ljava/lang/String;
            0      10     2 value   Z

  public void set(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokestatic  #32                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
         6: invokevirtual #29                 // Method set:(Ljava/lang/String;Ljava/lang/String;)V
         9: return
      LineNumberTable:
        line 65: 0
        line 66: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/MemoSet;
            0      10     1   key   Ljava/lang/String;
            0      10     2 value   I

  public void set(java.lang.String, long);
    descriptor: (Ljava/lang/String;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: lload_2
         3: invokestatic  #35                 // Method java/lang/String.valueOf:(J)Ljava/lang/String;
         6: invokevirtual #29                 // Method set:(Ljava/lang/String;Ljava/lang/String;)V
         9: return
      LineNumberTable:
        line 70: 0
        line 71: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/MemoSet;
            0      10     1   key   Ljava/lang/String;
            0      10     2 value   J

  public void set(java.lang.String, double);
    descriptor: (Ljava/lang/String;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: dload_2
         3: invokestatic  #38                 // Method java/lang/String.valueOf:(D)Ljava/lang/String;
         6: invokevirtual #29                 // Method set:(Ljava/lang/String;Ljava/lang/String;)V
         9: return
      LineNumberTable:
        line 75: 0
        line 76: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/MemoSet;
            0      10     1   key   Ljava/lang/String;
            0      10     2 value   D

  public void set(java.lang.String, java.lang.Enum<?>);
    descriptor: (Ljava/lang/String;Ljava/lang/Enum;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokestatic  #41                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         6: invokevirtual #29                 // Method set:(Ljava/lang/String;Ljava/lang/String;)V
         9: return
      LineNumberTable:
        line 80: 0
        line 81: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/MemoSet;
            0      10     1   key   Ljava/lang/String;
            0      10     2 value   Ljava/lang/Enum;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     2 value   Ljava/lang/Enum<*>;
    Signature: #132                         // (Ljava/lang/String;Ljava/lang/Enum<*>;)V

  public final void unset(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #44                 // Method onUnset:(Ljava/lang/String;)V
         5: aload_0
         6: aload_1
         7: invokevirtual #48                 // Method remove:(Ljava/lang/Object;)Ljava/lang/Object;
        10: pop
        11: return
      LineNumberTable:
        line 85: 0
        line 87: 5
        line 88: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/data/MemoSet;
            0      12     1   key   Ljava/lang/String;

  public boolean getBool(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore_2
         9: aload_2
        10: ifnull        18
        13: aload_2
        14: invokestatic  #55                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        17: ireturn
        18: new           #61                 // class java/lang/IllegalArgumentException
        21: dup
        22: aload_2
        23: aload_1
        24: invokedynamic #63,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        29: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        32: athrow
      LineNumberTable:
        line 92: 0
        line 93: 9
        line 94: 13
        line 96: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/commons/data/MemoSet;
            0      33     1   key   Ljava/lang/String;
            9      24     2   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]

  public boolean getBool(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore_3
         9: aload_3
        10: ifnull        18
        13: aload_3
        14: invokestatic  #55                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        17: ireturn
        18: iload_2
        19: ireturn
      LineNumberTable:
        line 101: 0
        line 102: 9
        line 103: 13
        line 105: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/data/MemoSet;
            0      20     1   key   Ljava/lang/String;
            0      20     2 defaultValue   Z
            9      11     3   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]

  public int getInteger(java.lang.String);
    descriptor: (Ljava/lang/String;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore_2
         9: aload_2
        10: ifnull        18
        13: aload_2
        14: invokestatic  #69                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        17: ireturn
        18: new           #61                 // class java/lang/IllegalArgumentException
        21: dup
        22: aload_2
        23: aload_1
        24: invokedynamic #75,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        29: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        32: athrow
      LineNumberTable:
        line 110: 0
        line 111: 9
        line 112: 13
        line 114: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/commons/data/MemoSet;
            0      33     1   key   Ljava/lang/String;
            9      24     2   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]

  public int getInteger(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore_3
         9: aload_3
        10: ifnull        18
        13: aload_3
        14: invokestatic  #69                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        17: ireturn
        18: iload_2
        19: ireturn
      LineNumberTable:
        line 119: 0
        line 120: 9
        line 121: 13
        line 123: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/data/MemoSet;
            0      20     1   key   Ljava/lang/String;
            0      20     2 defaultValue   I
            9      11     3   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]

  public long getLong(java.lang.String);
    descriptor: (Ljava/lang/String;)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore_2
         9: aload_2
        10: ifnull        18
        13: aload_2
        14: invokestatic  #76                 // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        17: lreturn
        18: new           #61                 // class java/lang/IllegalArgumentException
        21: dup
        22: aload_2
        23: aload_1
        24: invokedynamic #82,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        29: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        32: athrow
      LineNumberTable:
        line 128: 0
        line 129: 9
        line 130: 13
        line 132: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/commons/data/MemoSet;
            0      33     1   key   Ljava/lang/String;
            9      24     2   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]

  public long getLong(java.lang.String, long);
    descriptor: (Ljava/lang/String;J)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore        4
        10: aload         4
        12: ifnull        21
        15: aload         4
        17: invokestatic  #76                 // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        20: lreturn
        21: lload_2
        22: lreturn
      LineNumberTable:
        line 137: 0
        line 138: 10
        line 139: 15
        line 141: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/commons/data/MemoSet;
            0      23     1   key   Ljava/lang/String;
            0      23     2 defaultValue   J
           10      13     4   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/lang/String ]

  public double getDouble(java.lang.String);
    descriptor: (Ljava/lang/String;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore_2
         9: aload_2
        10: ifnull        18
        13: aload_2
        14: invokestatic  #83                 // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        17: dreturn
        18: new           #61                 // class java/lang/IllegalArgumentException
        21: dup
        22: aload_2
        23: aload_1
        24: invokedynamic #89,  0             // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        29: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        32: athrow
      LineNumberTable:
        line 146: 0
        line 147: 9
        line 148: 13
        line 150: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/commons/data/MemoSet;
            0      33     1   key   Ljava/lang/String;
            9      24     2   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]

  public double getDouble(java.lang.String, double);
    descriptor: (Ljava/lang/String;D)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore        4
        10: aload         4
        12: ifnull        21
        15: aload         4
        17: invokestatic  #83                 // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        20: dreturn
        21: dload_2
        22: dreturn
      LineNumberTable:
        line 155: 0
        line 156: 10
        line 157: 15
        line 159: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/commons/data/MemoSet;
            0      23     1   key   Ljava/lang/String;
            0      23     2 defaultValue   D
           10      13     4   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/lang/String ]

  public <E extends java.lang.Enum<E>> E getEnum(java.lang.String, java.lang.Class<E>);
    descriptor: (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore_3
         9: aload_3
        10: ifnull        19
        13: aload_2
        14: aload_3
        15: invokestatic  #90                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        18: areturn
        19: new           #61                 // class java/lang/IllegalArgumentException
        22: dup
        23: aload_2
        24: invokevirtual #95                 // Method java/lang/Class.getName:()Ljava/lang/String;
        27: aload_3
        28: invokedynamic #101,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        33: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        36: athrow
      LineNumberTable:
        line 164: 0
        line 166: 9
        line 167: 13
        line 169: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/commons/data/MemoSet;
            0      37     1  name   Ljava/lang/String;
            0      37     2 enumClass   Ljava/lang/Class;
            9      28     3   val   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      37     2 enumClass   Ljava/lang/Class<TE;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
    Signature: #151                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)TE;

  public <E extends java.lang.Enum<E>> E getEnum(java.lang.String, java.lang.Class<E>, E);
    descriptor: (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #52                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #24                 // class java/lang/String
         8: astore        4
        10: aload         4
        12: ifnull        22
        15: aload_2
        16: aload         4
        18: invokestatic  #90                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        21: areturn
        22: aload_3
        23: areturn
      LineNumberTable:
        line 174: 0
        line 176: 10
        line 177: 15
        line 179: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/commons/data/MemoSet;
            0      24     1  name   Ljava/lang/String;
            0      24     2 enumClass   Ljava/lang/Class;
            0      24     3 defaultValue   Ljava/lang/Enum;
           10      14     4   val   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      24     2 enumClass   Ljava/lang/Class<TE;>;
            0      24     3 defaultValue   TE;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/String ]
    Signature: #154                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/String;Ljava/lang/Class<TE;>;TE;)TE;
}
Signature: #155                         // Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/String;>;
SourceFile: "MemoSet.java"
BootstrapMethods:
  0: #169 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #159 MemoSet : Boolean value required, but found: \u0001 for key: \u0001.
  1: #169 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #161 MemoSet : Integer value required, but found: \u0001 for key: \u0001.
  2: #169 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #163 MemoSet : Long value required, but found: \u0001 for key: \u0001.
  3: #169 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #165 MemoSet : Double value required, but found: \u0001 for key: \u0001.
  4: #169 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #167 Enum value of type \u0001 required, but found: \u0001.
InnerClasses:
  public static final #180= #176 of #178; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
