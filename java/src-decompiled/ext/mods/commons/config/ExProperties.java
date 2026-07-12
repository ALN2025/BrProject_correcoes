// Bytecode for: ext.mods.commons.config.ExProperties
// File: ext\mods\commons\config\ExProperties.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/config/ExProperties.class
  Last modified 9 de jul de 2026; size 6378 bytes
  MD5 checksum f4fa74a69cea401d3882338beb648a87
  Compiled from "ExProperties.java"
public class ext.mods.commons.config.ExProperties extends java.util.Properties
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/commons/config/ExProperties
  super_class: #2                         // java/util/Properties
  interfaces: 0, fields: 4, methods: 19, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Properties."<init>":()V
    #2 = Class              #4            // java/util/Properties
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/Properties
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/io/File
    #8 = Utf8               java/io/File
    #9 = Methodref          #7.#10        // java/io/File."<init>":(Ljava/lang/String;)V
   #10 = NameAndType        #5:#11        // "<init>":(Ljava/lang/String;)V
   #11 = Utf8               (Ljava/lang/String;)V
   #12 = Methodref          #13.#14       // ext/mods/commons/config/ExProperties.load:(Ljava/io/File;)V
   #13 = Class              #15           // ext/mods/commons/config/ExProperties
   #14 = NameAndType        #16:#17       // load:(Ljava/io/File;)V
   #15 = Utf8               ext/mods/commons/config/ExProperties
   #16 = Utf8               load
   #17 = Utf8               (Ljava/io/File;)V
   #18 = Class              #19           // java/io/FileInputStream
   #19 = Utf8               java/io/FileInputStream
   #20 = Methodref          #18.#21       // java/io/FileInputStream."<init>":(Ljava/io/File;)V
   #21 = NameAndType        #5:#17        // "<init>":(Ljava/io/File;)V
   #22 = Methodref          #13.#23       // ext/mods/commons/config/ExProperties.load:(Ljava/io/InputStream;)V
   #23 = NameAndType        #16:#24       // load:(Ljava/io/InputStream;)V
   #24 = Utf8               (Ljava/io/InputStream;)V
   #25 = Methodref          #26.#27       // java/io/InputStream.close:()V
   #26 = Class              #28           // java/io/InputStream
   #27 = NameAndType        #29:#6        // close:()V
   #28 = Utf8               java/io/InputStream
   #29 = Utf8               close
   #30 = Class              #31           // java/lang/Throwable
   #31 = Utf8               java/lang/Throwable
   #32 = Methodref          #30.#33       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #33 = NameAndType        #34:#35       // addSuppressed:(Ljava/lang/Throwable;)V
   #34 = Utf8               addSuppressed
   #35 = Utf8               (Ljava/lang/Throwable;)V
   #36 = Methodref          #2.#37        // java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #37 = NameAndType        #38:#39       // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #38 = Utf8               getProperty
   #39 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #40 = Methodref          #41.#42       // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #41 = Class              #43           // java/lang/Boolean
   #42 = NameAndType        #44:#45       // parseBoolean:(Ljava/lang/String;)Z
   #43 = Utf8               java/lang/Boolean
   #44 = Utf8               parseBoolean
   #45 = Utf8               (Ljava/lang/String;)Z
   #46 = Fieldref           #13.#47       // ext/mods/commons/config/ExProperties.LOGGER:Lext/mods/commons/logging/CLogger;
   #47 = NameAndType        #48:#49       // LOGGER:Lext/mods/commons/logging/CLogger;
   #48 = Utf8               LOGGER
   #49 = Utf8               Lext/mods/commons/logging/CLogger;
   #50 = String             #51           // The following property key \'{}\' is missing. It will use default value \'{}\'.
   #51 = Utf8               The following property key \'{}\' is missing. It will use default value \'{}\'.
   #52 = Class              #53           // java/lang/Object
   #53 = Utf8               java/lang/Object
   #54 = Methodref          #41.#55       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #55 = NameAndType        #56:#57       // valueOf:(Z)Ljava/lang/Boolean;
   #56 = Utf8               valueOf
   #57 = Utf8               (Z)Ljava/lang/Boolean;
   #58 = Methodref          #59.#60       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #59 = Class              #61           // ext/mods/commons/logging/CLogger
   #60 = NameAndType        #62:#63       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #61 = Utf8               ext/mods/commons/logging/CLogger
   #62 = Utf8               warn
   #63 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #64 = Methodref          #65.#66       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #65 = Class              #67           // java/lang/Integer
   #66 = NameAndType        #68:#69       // parseInt:(Ljava/lang/String;)I
   #67 = Utf8               java/lang/Integer
   #68 = Utf8               parseInt
   #69 = Utf8               (Ljava/lang/String;)I
   #70 = Methodref          #65.#71       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #71 = NameAndType        #56:#72       // valueOf:(I)Ljava/lang/Integer;
   #72 = Utf8               (I)Ljava/lang/Integer;
   #73 = Methodref          #74.#75       // java/lang/Long.parseLong:(Ljava/lang/String;)J
   #74 = Class              #76           // java/lang/Long
   #75 = NameAndType        #77:#78       // parseLong:(Ljava/lang/String;)J
   #76 = Utf8               java/lang/Long
   #77 = Utf8               parseLong
   #78 = Utf8               (Ljava/lang/String;)J
   #79 = Methodref          #74.#80       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #80 = NameAndType        #56:#81       // valueOf:(J)Ljava/lang/Long;
   #81 = Utf8               (J)Ljava/lang/Long;
   #82 = Methodref          #83.#84       // java/lang/Double.parseDouble:(Ljava/lang/String;)D
   #83 = Class              #85           // java/lang/Double
   #84 = NameAndType        #86:#87       // parseDouble:(Ljava/lang/String;)D
   #85 = Utf8               java/lang/Double
   #86 = Utf8               parseDouble
   #87 = Utf8               (Ljava/lang/String;)D
   #88 = Methodref          #83.#89       // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #89 = NameAndType        #56:#90       // valueOf:(D)Ljava/lang/Double;
   #90 = Utf8               (D)Ljava/lang/Double;
   #91 = String             #92           // [\\s,;]+
   #92 = Utf8               [\\s,;]+
   #93 = Methodref          #13.#94       // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
   #94 = NameAndType        #38:#95       // getProperty:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
   #95 = Utf8               (Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
   #96 = Methodref          #97.#98       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #97 = Class              #99           // java/lang/String
   #98 = NameAndType        #100:#101     // split:(Ljava/lang/String;)[Ljava/lang/String;
   #99 = Utf8               java/lang/String
  #100 = Utf8               split
  #101 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #102 = Methodref          #13.#103      // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;[ZLjava/lang/String;)[Z
  #103 = NameAndType        #38:#104      // getProperty:(Ljava/lang/String;[ZLjava/lang/String;)[Z
  #104 = Utf8               (Ljava/lang/String;[ZLjava/lang/String;)[Z
  #105 = Methodref          #13.#106      // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;[ILjava/lang/String;)[I
  #106 = NameAndType        #38:#107      // getProperty:(Ljava/lang/String;[ILjava/lang/String;)[I
  #107 = Utf8               (Ljava/lang/String;[ILjava/lang/String;)[I
  #108 = Methodref          #13.#109      // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;[JLjava/lang/String;)[J
  #109 = NameAndType        #38:#110      // getProperty:(Ljava/lang/String;[JLjava/lang/String;)[J
  #110 = Utf8               (Ljava/lang/String;[JLjava/lang/String;)[J
  #111 = Methodref          #13.#112      // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;[DLjava/lang/String;)[D
  #112 = NameAndType        #38:#113      // getProperty:(Ljava/lang/String;[DLjava/lang/String;)[D
  #113 = Utf8               (Ljava/lang/String;[DLjava/lang/String;)[D
  #114 = Methodref          #13.#37       // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #115 = String             #116          // ;
  #116 = Utf8               ;
  #117 = Fieldref           #13.#118      // ext/mods/commons/config/ExProperties.NO_HOLDER:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #118 = NameAndType        #119:#120     // NO_HOLDER:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #119 = Utf8               NO_HOLDER
  #120 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #121 = Class              #122          // ext/mods/gameserver/model/holder/IntIntHolder
  #122 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #123 = String             #124          // -
  #124 = Utf8               -
  #125 = String             #126          // Error parsing entry \'{}\', it should be itemId-itemNumber.
  #126 = Utf8               Error parsing entry \'{}\', it should be itemId-itemNumber.
  #127 = Methodref          #121.#128     // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #128 = NameAndType        #5:#129       // "<init>":(II)V
  #129 = Utf8               (II)V
  #130 = Class              #131          // java/lang/Exception
  #131 = Utf8               java/lang/Exception
  #132 = String             #133          // Error parsing entry \'{}\', one of the value isn\'t a number.
  #133 = Utf8               Error parsing entry \'{}\', one of the value isn\'t a number.
  #134 = Methodref          #59.#135      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #135 = NameAndType        #136:#137     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #136 = Utf8               error
  #137 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #138 = Methodref          #139.#140     // java/lang/Class.getName:()Ljava/lang/String;
  #139 = Class              #141          // java/lang/Class
  #140 = NameAndType        #142:#143     // getName:()Ljava/lang/String;
  #141 = Utf8               java/lang/Class
  #142 = Utf8               getName
  #143 = Utf8               ()Ljava/lang/String;
  #144 = Methodref          #59.#10       // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #145 = Utf8               serialVersionUID
  #146 = Utf8               J
  #147 = Utf8               ConstantValue
  #148 = Long               1l
  #150 = Utf8               DEFAULT_DELIMITERS
  #151 = Utf8               Ljava/lang/String;
  #152 = Utf8               Code
  #153 = Utf8               LineNumberTable
  #154 = Utf8               LocalVariableTable
  #155 = Utf8               this
  #156 = Utf8               Lext/mods/commons/config/ExProperties;
  #157 = Utf8               fileName
  #158 = Utf8               Exceptions
  #159 = Class              #160          // java/io/IOException
  #160 = Utf8               java/io/IOException
  #161 = Utf8               is
  #162 = Utf8               Ljava/io/InputStream;
  #163 = Utf8               file
  #164 = Utf8               Ljava/io/File;
  #165 = Utf8               StackMapTable
  #166 = Utf8               (Ljava/lang/String;Z)Z
  #167 = Utf8               name
  #168 = Utf8               defaultValue
  #169 = Utf8               Z
  #170 = Utf8               val
  #171 = Utf8               value
  #172 = Utf8               (Ljava/lang/String;I)I
  #173 = Utf8               I
  #174 = Utf8               (Ljava/lang/String;J)J
  #175 = Utf8               (Ljava/lang/String;D)D
  #176 = Utf8               D
  #177 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
  #178 = Utf8               [Ljava/lang/String;
  #179 = Utf8               delimiter
  #180 = Class              #178          // "[Ljava/lang/String;"
  #181 = Utf8               (Ljava/lang/String;[Z)[Z
  #182 = Utf8               [Z
  #183 = Utf8               i
  #184 = Utf8               values
  #185 = Class              #182          // "[Z"
  #186 = Utf8               (Ljava/lang/String;[I)[I
  #187 = Utf8               [I
  #188 = Class              #187          // "[I"
  #189 = Utf8               (Ljava/lang/String;[J)[J
  #190 = Utf8               [J
  #191 = Class              #190          // "[J"
  #192 = Utf8               (Ljava/lang/String;[D)[D
  #193 = Utf8               [D
  #194 = Class              #193          // "[D"
  #195 = Utf8               parseIntIntList
  #196 = Utf8               (Ljava/lang/String;Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
  #197 = Utf8               e
  #198 = Utf8               Ljava/lang/Exception;
  #199 = Utf8               valueSplit
  #200 = Utf8               key
  #201 = Utf8               propertySplit
  #202 = Utf8               result
  #203 = Class              #120          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #204 = Utf8               <clinit>
  #205 = Utf8               SourceFile
  #206 = Utf8               ExProperties.java
{
  public static final java.lang.String DEFAULT_DELIMITERS;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String [\\s,;]+

  public ext.mods.commons.config.ExProperties();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/Properties."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/config/ExProperties;

  public void load(java.lang.String) throws java.io.IOException;
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: new           #7                  // class java/io/File
         4: dup
         5: aload_1
         6: invokespecial #9                  // Method java/io/File."<init>":(Ljava/lang/String;)V
         9: invokevirtual #12                 // Method load:(Ljava/io/File;)V
        12: return
      LineNumberTable:
        line 41: 0
        line 42: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/commons/config/ExProperties;
            0      13     1 fileName   Ljava/lang/String;
    Exceptions:
      throws java.io.IOException

  public void load(java.io.File) throws java.io.IOException;
    descriptor: (Ljava/io/File;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: new           #18                 // class java/io/FileInputStream
         3: dup
         4: aload_1
         5: invokespecial #20                 // Method java/io/FileInputStream."<init>":(Ljava/io/File;)V
         8: astore_2
         9: aload_0
        10: aload_2
        11: invokevirtual #22                 // Method load:(Ljava/io/InputStream;)V
        14: aload_2
        15: invokevirtual #25                 // Method java/io/InputStream.close:()V
        18: goto          39
        21: astore_3
        22: aload_2
        23: invokevirtual #25                 // Method java/io/InputStream.close:()V
        26: goto          37
        29: astore        4
        31: aload_3
        32: aload         4
        34: invokevirtual #32                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        37: aload_3
        38: athrow
        39: return
      Exception table:
         from    to  target type
             9    14    21   Class java/lang/Throwable
            22    26    29   Class java/lang/Throwable
      LineNumberTable:
        line 46: 0
        line 48: 9
        line 49: 14
        line 46: 21
        line 50: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      30     2    is   Ljava/io/InputStream;
            0      40     0  this   Lext/mods/commons/config/ExProperties;
            0      40     1  file   Ljava/io/File;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/commons/config/ExProperties, class java/io/File, class java/io/InputStream ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/commons/config/ExProperties, class java/io/File, class java/io/InputStream, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
    Exceptions:
      throws java.io.IOException

  public boolean getProperty(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: iload_2
         1: istore_3
         2: aload_0
         3: aload_1
         4: aconst_null
         5: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         8: dup
         9: astore        4
        11: ifnull        23
        14: aload         4
        16: invokestatic  #40                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        19: istore_3
        20: goto          46
        23: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        28: iconst_2
        29: anewarray     #52                 // class java/lang/Object
        32: dup
        33: iconst_0
        34: aload_1
        35: aastore
        36: dup
        37: iconst_1
        38: iload_2
        39: invokestatic  #54                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        42: aastore
        43: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        46: iload_3
        47: ireturn
      LineNumberTable:
        line 54: 0
        line 58: 2
        line 59: 14
        line 61: 23
        line 63: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/commons/config/ExProperties;
            0      48     1  name   Ljava/lang/String;
            0      48     2 defaultValue   Z
            2      46     3   val   Z
           11      37     4 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ int, class java/lang/String ]
        frame_type = 22 /* same */

  public int getProperty(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: iload_2
         1: istore_3
         2: aload_0
         3: aload_1
         4: aconst_null
         5: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         8: dup
         9: astore        4
        11: ifnull        23
        14: aload         4
        16: invokestatic  #64                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        19: istore_3
        20: goto          46
        23: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        28: iconst_2
        29: anewarray     #52                 // class java/lang/Object
        32: dup
        33: iconst_0
        34: aload_1
        35: aastore
        36: dup
        37: iconst_1
        38: iload_2
        39: invokestatic  #70                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        42: aastore
        43: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        46: iload_3
        47: ireturn
      LineNumberTable:
        line 68: 0
        line 72: 2
        line 73: 14
        line 75: 23
        line 77: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/commons/config/ExProperties;
            0      48     1  name   Ljava/lang/String;
            0      48     2 defaultValue   I
            2      46     3   val   I
           11      37     4 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ int, class java/lang/String ]
        frame_type = 22 /* same */

  public long getProperty(java.lang.String, long);
    descriptor: (Ljava/lang/String;J)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=3
         0: lload_2
         1: lstore        4
         3: aload_0
         4: aload_1
         5: aconst_null
         6: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         9: dup
        10: astore        6
        12: ifnull        25
        15: aload         6
        17: invokestatic  #73                 // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        20: lstore        4
        22: goto          48
        25: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        28: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        30: iconst_2
        31: anewarray     #52                 // class java/lang/Object
        34: dup
        35: iconst_0
        36: aload_1
        37: aastore
        38: dup
        39: iconst_1
        40: lload_2
        41: invokestatic  #79                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        44: aastore
        45: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        48: lload         4
        50: lreturn
      LineNumberTable:
        line 82: 0
        line 86: 3
        line 87: 15
        line 89: 25
        line 91: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/commons/config/ExProperties;
            0      51     1  name   Ljava/lang/String;
            0      51     2 defaultValue   J
            3      48     4   val   J
           12      39     6 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ long, class java/lang/String ]
        frame_type = 22 /* same */

  public double getProperty(java.lang.String, double);
    descriptor: (Ljava/lang/String;D)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=3
         0: dload_2
         1: dstore        4
         3: aload_0
         4: aload_1
         5: aconst_null
         6: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         9: dup
        10: astore        6
        12: ifnull        25
        15: aload         6
        17: invokestatic  #82                 // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        20: dstore        4
        22: goto          48
        25: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        28: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        30: iconst_2
        31: anewarray     #52                 // class java/lang/Object
        34: dup
        35: iconst_0
        36: aload_1
        37: aastore
        38: dup
        39: iconst_1
        40: dload_2
        41: invokestatic  #88                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        44: aastore
        45: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        48: dload         4
        50: dreturn
      LineNumberTable:
        line 96: 0
        line 100: 3
        line 101: 15
        line 103: 25
        line 105: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/commons/config/ExProperties;
            0      51     1  name   Ljava/lang/String;
            0      51     2 defaultValue   D
            3      48     4   val   D
           12      39     6 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ double, class java/lang/String ]
        frame_type = 22 /* same */

  public java.lang.String[] getProperty(java.lang.String, java.lang.String[]);
    descriptor: (Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: ldc           #91                 // String [\\s,;]+
         5: invokevirtual #93                 // Method getProperty:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
         8: areturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/config/ExProperties;
            0       9     1  name   Ljava/lang/String;
            0       9     2 defaultValue   [Ljava/lang/String;

  public java.lang.String[] getProperty(java.lang.String, java.lang.String[], java.lang.String);
    descriptor: (Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=4
         0: aload_2
         1: astore        4
         3: aload_0
         4: aload_1
         5: aconst_null
         6: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         9: dup
        10: astore        5
        12: ifnull        26
        15: aload         5
        17: aload_3
        18: invokevirtual #96                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        21: astore        4
        23: goto          46
        26: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        29: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        31: iconst_2
        32: anewarray     #52                 // class java/lang/Object
        35: dup
        36: iconst_0
        37: aload_1
        38: aastore
        39: dup
        40: iconst_1
        41: aload_2
        42: aastore
        43: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        46: aload         4
        48: areturn
      LineNumberTable:
        line 115: 0
        line 118: 3
        line 119: 15
        line 121: 26
        line 123: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/commons/config/ExProperties;
            0      49     1  name   Ljava/lang/String;
            0      49     2 defaultValue   [Ljava/lang/String;
            0      49     3 delimiter   Ljava/lang/String;
            3      46     4   val   [Ljava/lang/String;
           12      37     5 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class "[Ljava/lang/String;", class java/lang/String ]
        frame_type = 19 /* same */

  public boolean[] getProperty(java.lang.String, boolean[]);
    descriptor: (Ljava/lang/String;[Z)[Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: ldc           #91                 // String [\\s,;]+
         5: invokevirtual #102                // Method getProperty:(Ljava/lang/String;[ZLjava/lang/String;)[Z
         8: areturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/config/ExProperties;
            0       9     1  name   Ljava/lang/String;
            0       9     2 defaultValue   [Z

  public boolean[] getProperty(java.lang.String, boolean[], java.lang.String);
    descriptor: (Ljava/lang/String;[ZLjava/lang/String;)[Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=4
         0: aload_2
         1: astore        4
         3: aload_0
         4: aload_1
         5: aconst_null
         6: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         9: dup
        10: astore        5
        12: ifnull        63
        15: aload         5
        17: aload_3
        18: invokevirtual #96                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        21: astore        6
        23: aload         6
        25: arraylength
        26: newarray       boolean
        28: astore        4
        30: iconst_0
        31: istore        7
        33: iload         7
        35: aload         4
        37: arraylength
        38: if_icmpge     60
        41: aload         4
        43: iload         7
        45: aload         6
        47: iload         7
        49: aaload
        50: invokestatic  #40                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        53: bastore
        54: iinc          7, 1
        57: goto          33
        60: goto          83
        63: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        66: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        68: iconst_2
        69: anewarray     #52                 // class java/lang/Object
        72: dup
        73: iconst_0
        74: aload_1
        75: aastore
        76: dup
        77: iconst_1
        78: aload_2
        79: aastore
        80: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        83: aload         4
        85: areturn
      LineNumberTable:
        line 133: 0
        line 136: 3
        line 138: 15
        line 139: 23
        line 140: 30
        line 141: 41
        line 140: 54
        line 142: 60
        line 144: 63
        line 146: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      27     7     i   I
           23      37     6 values   [Ljava/lang/String;
            0      86     0  this   Lext/mods/commons/config/ExProperties;
            0      86     1  name   Ljava/lang/String;
            0      86     2 defaultValue   [Z
            0      86     3 delimiter   Ljava/lang/String;
            3      83     4   val   [Z
           12      74     5 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/commons/config/ExProperties, class java/lang/String, class "[Z", class java/lang/String, class "[Z", class java/lang/String, class "[Ljava/lang/String;", int ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 2 /* same */
        frame_type = 19 /* same */

  public int[] getProperty(java.lang.String, int[]);
    descriptor: (Ljava/lang/String;[I)[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: ldc           #91                 // String [\\s,;]+
         5: invokevirtual #105                // Method getProperty:(Ljava/lang/String;[ILjava/lang/String;)[I
         8: areturn
      LineNumberTable:
        line 151: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/config/ExProperties;
            0       9     1  name   Ljava/lang/String;
            0       9     2 defaultValue   [I

  public int[] getProperty(java.lang.String, int[], java.lang.String);
    descriptor: (Ljava/lang/String;[ILjava/lang/String;)[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=4
         0: aload_2
         1: astore        4
         3: aload_0
         4: aload_1
         5: aconst_null
         6: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         9: dup
        10: astore        5
        12: ifnull        63
        15: aload         5
        17: aload_3
        18: invokevirtual #96                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        21: astore        6
        23: aload         6
        25: arraylength
        26: newarray       int
        28: astore        4
        30: iconst_0
        31: istore        7
        33: iload         7
        35: aload         4
        37: arraylength
        38: if_icmpge     60
        41: aload         4
        43: iload         7
        45: aload         6
        47: iload         7
        49: aaload
        50: invokestatic  #64                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        53: iastore
        54: iinc          7, 1
        57: goto          33
        60: goto          83
        63: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        66: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        68: iconst_2
        69: anewarray     #52                 // class java/lang/Object
        72: dup
        73: iconst_0
        74: aload_1
        75: aastore
        76: dup
        77: iconst_1
        78: aload_2
        79: aastore
        80: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        83: aload         4
        85: areturn
      LineNumberTable:
        line 156: 0
        line 159: 3
        line 161: 15
        line 162: 23
        line 163: 30
        line 164: 41
        line 163: 54
        line 165: 60
        line 167: 63
        line 169: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      27     7     i   I
           23      37     6 values   [Ljava/lang/String;
            0      86     0  this   Lext/mods/commons/config/ExProperties;
            0      86     1  name   Ljava/lang/String;
            0      86     2 defaultValue   [I
            0      86     3 delimiter   Ljava/lang/String;
            3      83     4   val   [I
           12      74     5 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/commons/config/ExProperties, class java/lang/String, class "[I", class java/lang/String, class "[I", class java/lang/String, class "[Ljava/lang/String;", int ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 2 /* same */
        frame_type = 19 /* same */

  public long[] getProperty(java.lang.String, long[]);
    descriptor: (Ljava/lang/String;[J)[J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: ldc           #91                 // String [\\s,;]+
         5: invokevirtual #108                // Method getProperty:(Ljava/lang/String;[JLjava/lang/String;)[J
         8: areturn
      LineNumberTable:
        line 174: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/config/ExProperties;
            0       9     1  name   Ljava/lang/String;
            0       9     2 defaultValue   [J

  public long[] getProperty(java.lang.String, long[], java.lang.String);
    descriptor: (Ljava/lang/String;[JLjava/lang/String;)[J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=4
         0: aload_2
         1: astore        4
         3: aload_0
         4: aload_1
         5: aconst_null
         6: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         9: dup
        10: astore        5
        12: ifnull        63
        15: aload         5
        17: aload_3
        18: invokevirtual #96                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        21: astore        6
        23: aload         6
        25: arraylength
        26: newarray       long
        28: astore        4
        30: iconst_0
        31: istore        7
        33: iload         7
        35: aload         4
        37: arraylength
        38: if_icmpge     60
        41: aload         4
        43: iload         7
        45: aload         6
        47: iload         7
        49: aaload
        50: invokestatic  #73                 // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        53: lastore
        54: iinc          7, 1
        57: goto          33
        60: goto          83
        63: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        66: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        68: iconst_2
        69: anewarray     #52                 // class java/lang/Object
        72: dup
        73: iconst_0
        74: aload_1
        75: aastore
        76: dup
        77: iconst_1
        78: aload_2
        79: aastore
        80: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        83: aload         4
        85: areturn
      LineNumberTable:
        line 179: 0
        line 182: 3
        line 184: 15
        line 185: 23
        line 186: 30
        line 187: 41
        line 186: 54
        line 188: 60
        line 190: 63
        line 192: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      27     7     i   I
           23      37     6 values   [Ljava/lang/String;
            0      86     0  this   Lext/mods/commons/config/ExProperties;
            0      86     1  name   Ljava/lang/String;
            0      86     2 defaultValue   [J
            0      86     3 delimiter   Ljava/lang/String;
            3      83     4   val   [J
           12      74     5 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/commons/config/ExProperties, class java/lang/String, class "[J", class java/lang/String, class "[J", class java/lang/String, class "[Ljava/lang/String;", int ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 2 /* same */
        frame_type = 19 /* same */

  public double[] getProperty(java.lang.String, double[]);
    descriptor: (Ljava/lang/String;[D)[D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: ldc           #91                 // String [\\s,;]+
         5: invokevirtual #111                // Method getProperty:(Ljava/lang/String;[DLjava/lang/String;)[D
         8: areturn
      LineNumberTable:
        line 197: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/config/ExProperties;
            0       9     1  name   Ljava/lang/String;
            0       9     2 defaultValue   [D

  public double[] getProperty(java.lang.String, double[], java.lang.String);
    descriptor: (Ljava/lang/String;[DLjava/lang/String;)[D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=4
         0: aload_2
         1: astore        4
         3: aload_0
         4: aload_1
         5: aconst_null
         6: invokespecial #36                 // Method java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         9: dup
        10: astore        5
        12: ifnull        63
        15: aload         5
        17: aload_3
        18: invokevirtual #96                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        21: astore        6
        23: aload         6
        25: arraylength
        26: newarray       double
        28: astore        4
        30: iconst_0
        31: istore        7
        33: iload         7
        35: aload         4
        37: arraylength
        38: if_icmpge     60
        41: aload         4
        43: iload         7
        45: aload         6
        47: iload         7
        49: aaload
        50: invokestatic  #82                 // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        53: dastore
        54: iinc          7, 1
        57: goto          33
        60: goto          83
        63: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        66: ldc           #50                 // String The following property key \'{}\' is missing. It will use default value \'{}\'.
        68: iconst_2
        69: anewarray     #52                 // class java/lang/Object
        72: dup
        73: iconst_0
        74: aload_1
        75: aastore
        76: dup
        77: iconst_1
        78: aload_2
        79: aastore
        80: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        83: aload         4
        85: areturn
      LineNumberTable:
        line 202: 0
        line 205: 3
        line 207: 15
        line 208: 23
        line 209: 30
        line 210: 41
        line 209: 54
        line 211: 60
        line 213: 63
        line 215: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      27     7     i   I
           23      37     6 values   [Ljava/lang/String;
            0      86     0  this   Lext/mods/commons/config/ExProperties;
            0      86     1  name   Ljava/lang/String;
            0      86     2 defaultValue   [D
            0      86     3 delimiter   Ljava/lang/String;
            3      83     4   val   [D
           12      74     5 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/commons/config/ExProperties, class java/lang/String, class "[D", class java/lang/String, class "[D", class java/lang/String, class "[Ljava/lang/String;", int ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 2 /* same */
        frame_type = 19 /* same */

  public final ext.mods.gameserver.model.holder.IntIntHolder[] parseIntIntList(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=12, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #114                // Method getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         6: ldc           #115                // String ;
         8: invokevirtual #96                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        11: astore_3
        12: aload_3
        13: arraylength
        14: ifne          21
        17: getstatic     #117                // Field NO_HOLDER:[Lext/mods/gameserver/model/holder/IntIntHolder;
        20: areturn
        21: iconst_0
        22: istore        4
        24: aload_3
        25: arraylength
        26: anewarray     #121                // class ext/mods/gameserver/model/holder/IntIntHolder
        29: astore        5
        31: aload_3
        32: astore        6
        34: aload         6
        36: arraylength
        37: istore        7
        39: iconst_0
        40: istore        8
        42: iload         8
        44: iload         7
        46: if_icmpge     154
        49: aload         6
        51: iload         8
        53: aaload
        54: astore        9
        56: aload         9
        58: ldc           #123                // String -
        60: invokevirtual #96                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        63: astore        10
        65: aload         10
        67: arraylength
        68: iconst_2
        69: if_icmpeq     92
        72: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        75: ldc           #125                // String Error parsing entry \'{}\', it should be itemId-itemNumber.
        77: iconst_1
        78: anewarray     #52                 // class java/lang/Object
        81: dup
        82: iconst_0
        83: aload_1
        84: aastore
        85: invokevirtual #58                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        88: getstatic     #117                // Field NO_HOLDER:[Lext/mods/gameserver/model/holder/IntIntHolder;
        91: areturn
        92: aload         5
        94: iload         4
        96: new           #121                // class ext/mods/gameserver/model/holder/IntIntHolder
        99: dup
       100: aload         10
       102: iconst_0
       103: aaload
       104: invokestatic  #64                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       107: aload         10
       109: iconst_1
       110: aaload
       111: invokestatic  #64                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       114: invokespecial #127                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       117: aastore
       118: goto          145
       121: astore        11
       123: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       126: ldc           #132                // String Error parsing entry \'{}\', one of the value isn\'t a number.
       128: aload         11
       130: iconst_1
       131: anewarray     #52                 // class java/lang/Object
       134: dup
       135: iconst_0
       136: aload_1
       137: aastore
       138: invokevirtual #134                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       141: getstatic     #117                // Field NO_HOLDER:[Lext/mods/gameserver/model/holder/IntIntHolder;
       144: areturn
       145: iinc          4, 1
       148: iinc          8, 1
       151: goto          42
       154: aload         5
       156: areturn
      Exception table:
         from    to  target type
            92   118   121   Class java/lang/Exception
      LineNumberTable:
        line 225: 0
        line 226: 12
        line 227: 17
        line 229: 21
        line 230: 24
        line 231: 31
        line 233: 56
        line 234: 65
        line 236: 72
        line 237: 88
        line 242: 92
        line 248: 118
        line 244: 121
        line 246: 123
        line 247: 141
        line 250: 145
        line 231: 148
        line 252: 154
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          123      22    11     e   Ljava/lang/Exception;
           65      83    10 valueSplit   [Ljava/lang/String;
           56      92     9 value   Ljava/lang/String;
            0     157     0  this   Lext/mods/commons/config/ExProperties;
            0     157     1   key   Ljava/lang/String;
            0     157     2 defaultValue   Ljava/lang/String;
           12     145     3 propertySplit   [Ljava/lang/String;
           24     133     4     i   I
           31     126     5 result   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/commons/config/ExProperties, class java/lang/String, class java/lang/String, class "[Ljava/lang/String;", int, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 49
          locals = [ class java/lang/String, class "[Ljava/lang/String;" ]
        frame_type = 92 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/commons/config/ExProperties, class java/lang/String, class java/lang/String, class "[Ljava/lang/String;", int, class "[Lext/mods/gameserver/model/holder/IntIntHolder;" ]
          stack = []

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #59                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #13                 // class ext/mods/commons/config/ExProperties
         6: invokevirtual #138                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #144                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: iconst_0
        16: anewarray     #121                // class ext/mods/gameserver/model/holder/IntIntHolder
        19: putstatic     #117                // Field NO_HOLDER:[Lext/mods/gameserver/model/holder/IntIntHolder;
        22: return
      LineNumberTable:
        line 32: 0
        line 35: 15
}
SourceFile: "ExProperties.java"
