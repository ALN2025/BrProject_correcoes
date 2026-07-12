// Bytecode for: ext.mods.commons.util.QueryParser
// File: ext\mods\commons\util\QueryParser.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/QueryParser.class
  Last modified 9 de jul de 2026; size 3505 bytes
  MD5 checksum b5c9e7d65df9435232fe061ed13ca705
  Compiled from "QueryParser.java"
public class ext.mods.commons.util.QueryParser
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/util/QueryParser
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 14, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/util/QueryParser._input:Ljava/lang/String;
    #8 = Class              #10           // ext/mods/commons/util/QueryParser
    #9 = NameAndType        #11:#12       // _input:Ljava/lang/String;
   #10 = Utf8               ext/mods/commons/util/QueryParser
   #11 = Utf8               _input
   #12 = Utf8               Ljava/lang/String;
   #13 = Fieldref           #8.#14        // ext/mods/commons/util/QueryParser._start:I
   #14 = NameAndType        #15:#16       // _start:I
   #15 = Utf8               _start
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/commons/util/QueryParser._end:I
   #18 = NameAndType        #19:#16       // _end:I
   #19 = Utf8               _end
   #20 = Methodref          #21.#22       // java/lang/String.substring:(II)Ljava/lang/String;
   #21 = Class              #23           // java/lang/String
   #22 = NameAndType        #24:#25       // substring:(II)Ljava/lang/String;
   #23 = Utf8               java/lang/String
   #24 = Utf8               substring
   #25 = Utf8               (II)Ljava/lang/String;
   #26 = Fieldref           #8.#27        // ext/mods/commons/util/QueryParser._pos:I
   #27 = NameAndType        #28:#16       // _pos:I
   #28 = Utf8               _pos
   #29 = Methodref          #21.#30       // java/lang/String.charAt:(I)C
   #30 = NameAndType        #31:#32       // charAt:(I)C
   #31 = Utf8               charAt
   #32 = Utf8               (I)C
   #33 = Methodref          #21.#34       // java/lang/String.length:()I
   #34 = NameAndType        #35:#36       // length:()I
   #35 = Utf8               length
   #36 = Utf8               ()I
   #37 = Class              #38           // java/util/HashMap
   #38 = Utf8               java/util/HashMap
   #39 = Methodref          #37.#3        // java/util/HashMap."<init>":()V
   #40 = String             #41           // $name
   #41 = Utf8               $name
   #42 = Methodref          #8.#43        // ext/mods/commons/util/QueryParser.scanID:()Ljava/lang/String;
   #43 = NameAndType        #44:#45       // scanID:()Ljava/lang/String;
   #44 = Utf8               scanID
   #45 = Utf8               ()Ljava/lang/String;
   #46 = Methodref          #21.#47       // java/lang/String.trim:()Ljava/lang/String;
   #47 = NameAndType        #48:#45       // trim:()Ljava/lang/String;
   #48 = Utf8               trim
   #49 = InterfaceMethodref #50.#51       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #50 = Class              #52           // java/util/Map
   #51 = NameAndType        #53:#54       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #52 = Utf8               java/util/Map
   #53 = Utf8               put
   #54 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #55 = Fieldref           #8.#56        // ext/mods/commons/util/QueryParser.QST:Ljava/util/function/IntPredicate;
   #56 = NameAndType        #57:#58       // QST:Ljava/util/function/IntPredicate;
   #57 = Utf8               QST
   #58 = Utf8               Ljava/util/function/IntPredicate;
   #59 = Methodref          #8.#60        // ext/mods/commons/util/QueryParser.match:(Ljava/util/function/IntPredicate;)Z
   #60 = NameAndType        #61:#62       // match:(Ljava/util/function/IntPredicate;)Z
   #61 = Utf8               match
   #62 = Utf8               (Ljava/util/function/IntPredicate;)Z
   #63 = Methodref          #8.#64        // ext/mods/commons/util/QueryParser.eof:()Z
   #64 = NameAndType        #65:#66       // eof:()Z
   #65 = Utf8               eof
   #66 = Utf8               ()Z
   #67 = Fieldref           #8.#68        // ext/mods/commons/util/QueryParser.EQS:Ljava/util/function/IntPredicate;
   #68 = NameAndType        #69:#58       // EQS:Ljava/util/function/IntPredicate;
   #69 = Utf8               EQS
   #70 = Fieldref           #8.#71        // ext/mods/commons/util/QueryParser.AMP:Ljava/util/function/IntPredicate;
   #71 = NameAndType        #72:#58       // AMP:Ljava/util/function/IntPredicate;
   #72 = Utf8               AMP
   #73 = String             #74           //
   #74 = Utf8
   #75 = Fieldref           #8.#76        // ext/mods/commons/util/QueryParser.CH:Ljava/util/function/IntPredicate;
   #76 = NameAndType        #77:#58       // CH:Ljava/util/function/IntPredicate;
   #77 = Utf8               CH
   #78 = Methodref          #8.#79        // ext/mods/commons/util/QueryParser.image:()Ljava/lang/String;
   #79 = NameAndType        #80:#45       // image:()Ljava/lang/String;
   #80 = Utf8               image
   #81 = Methodref          #8.#82        // ext/mods/commons/util/QueryParser.peek:()I
   #82 = NameAndType        #83:#36       // peek:()I
   #83 = Utf8               peek
   #84 = InterfaceMethodref #85.#86       // java/util/function/IntPredicate.test:(I)Z
   #85 = Class              #87           // java/util/function/IntPredicate
   #86 = NameAndType        #88:#89       // test:(I)Z
   #87 = Utf8               java/util/function/IntPredicate
   #88 = Utf8               test
   #89 = Utf8               (I)Z
   #90 = Methodref          #8.#91        // ext/mods/commons/util/QueryParser.is:(Ljava/util/function/IntPredicate;)Z
   #91 = NameAndType        #92:#62       // is:(Ljava/util/function/IntPredicate;)Z
   #92 = Utf8               is
   #93 = Methodref          #8.#94        // ext/mods/commons/util/QueryParser.consume:()V
   #94 = NameAndType        #95:#6        // consume:()V
   #95 = Utf8               consume
   #96 = Methodref          #8.#3         // ext/mods/commons/util/QueryParser."<init>":()V
   #97 = Methodref          #8.#98        // ext/mods/commons/util/QueryParser.scan:(Ljava/lang/String;)Ljava/util/Map;
   #98 = NameAndType        #99:#100      // scan:(Ljava/lang/String;)Ljava/util/Map;
   #99 = Utf8               scan
  #100 = Utf8               (Ljava/lang/String;)Ljava/util/Map;
  #101 = InvokeDynamic      #0:#102       // #0:test:()Ljava/util/function/IntPredicate;
  #102 = NameAndType        #88:#103      // test:()Ljava/util/function/IntPredicate;
  #103 = Utf8               ()Ljava/util/function/IntPredicate;
  #104 = InvokeDynamic      #1:#102       // #1:test:()Ljava/util/function/IntPredicate;
  #105 = InvokeDynamic      #2:#102       // #2:test:()Ljava/util/function/IntPredicate;
  #106 = InterfaceMethodref #85.#107      // java/util/function/IntPredicate.or:(Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;
  #107 = NameAndType        #108:#109     // or:(Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;
  #108 = Utf8               or
  #109 = Utf8               (Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;
  #110 = InterfaceMethodref #85.#111      // java/util/function/IntPredicate.negate:()Ljava/util/function/IntPredicate;
  #111 = NameAndType        #112:#103     // negate:()Ljava/util/function/IntPredicate;
  #112 = Utf8               negate
  #113 = Utf8               Code
  #114 = Utf8               LineNumberTable
  #115 = Utf8               LocalVariableTable
  #116 = Utf8               this
  #117 = Utf8               Lext/mods/commons/util/QueryParser;
  #118 = Utf8               StackMapTable
  #119 = Utf8               key
  #120 = Utf8               input
  #121 = Utf8               props
  #122 = Utf8               Ljava/util/Map;
  #123 = Utf8               LocalVariableTypeTable
  #124 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #125 = Utf8               Signature
  #126 = Utf8               (Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #127 = Utf8               predicate
  #128 = Utf8               parse
  #129 = Utf8               lambda$static$2
  #130 = Utf8               ch
  #131 = Utf8               lambda$static$1
  #132 = Utf8               lambda$static$0
  #133 = Utf8               <clinit>
  #134 = Utf8               SourceFile
  #135 = Utf8               QueryParser.java
  #136 = Utf8               BootstrapMethods
  #137 = MethodType         #89           //  (I)Z
  #138 = MethodHandle       6:#139        // REF_invokeStatic ext/mods/commons/util/QueryParser.lambda$static$0:(I)Z
  #139 = Methodref          #8.#140       // ext/mods/commons/util/QueryParser.lambda$static$0:(I)Z
  #140 = NameAndType        #132:#89      // lambda$static$0:(I)Z
  #141 = MethodHandle       6:#142        // REF_invokeStatic ext/mods/commons/util/QueryParser.lambda$static$1:(I)Z
  #142 = Methodref          #8.#143       // ext/mods/commons/util/QueryParser.lambda$static$1:(I)Z
  #143 = NameAndType        #131:#89      // lambda$static$1:(I)Z
  #144 = MethodHandle       6:#145        // REF_invokeStatic ext/mods/commons/util/QueryParser.lambda$static$2:(I)Z
  #145 = Methodref          #8.#146       // ext/mods/commons/util/QueryParser.lambda$static$2:(I)Z
  #146 = NameAndType        #129:#89      // lambda$static$2:(I)Z
  #147 = MethodHandle       6:#148        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #148 = Methodref          #149.#150     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #149 = Class              #151          // java/lang/invoke/LambdaMetafactory
  #150 = NameAndType        #152:#153     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #151 = Utf8               java/lang/invoke/LambdaMetafactory
  #152 = Utf8               metafactory
  #153 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #154 = Utf8               InnerClasses
  #155 = Class              #156          // java/lang/invoke/MethodHandles$Lookup
  #156 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #157 = Class              #158          // java/lang/invoke/MethodHandles
  #158 = Utf8               java/lang/invoke/MethodHandles
  #159 = Utf8               Lookup
{
  public static final java.util.function.IntPredicate QST;
    descriptor: Ljava/util/function/IntPredicate;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.util.function.IntPredicate EQS;
    descriptor: Ljava/util/function/IntPredicate;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.util.function.IntPredicate AMP;
    descriptor: Ljava/util/function/IntPredicate;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.util.function.IntPredicate CH;
    descriptor: Ljava/util/function/IntPredicate;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.commons.util.QueryParser();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/util/QueryParser;

  public java.util.Map<java.lang.String, java.lang.String> scan(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: aload_0
         2: aload_0
         3: iconst_0
         4: dup_x1
         5: putfield      #17                 // Field _end:I
         8: dup_x1
         9: putfield      #13                 // Field _start:I
        12: putfield      #26                 // Field _pos:I
        15: aload_0
        16: aload_1
        17: putfield      #7                  // Field _input:Ljava/lang/String;
        20: new           #37                 // class java/util/HashMap
        23: dup
        24: invokespecial #39                 // Method java/util/HashMap."<init>":()V
        27: astore_2
        28: aload_2
        29: ldc           #40                 // String $name
        31: aload_0
        32: invokevirtual #42                 // Method scanID:()Ljava/lang/String;
        35: invokevirtual #46                 // Method java/lang/String.trim:()Ljava/lang/String;
        38: invokeinterface #49,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        43: pop
        44: aload_0
        45: getstatic     #55                 // Field QST:Ljava/util/function/IntPredicate;
        48: invokevirtual #59                 // Method match:(Ljava/util/function/IntPredicate;)Z
        51: ifeq          147
        54: aload_0
        55: invokevirtual #63                 // Method eof:()Z
        58: ifne          147
        61: aload_0
        62: invokevirtual #42                 // Method scanID:()Ljava/lang/String;
        65: invokevirtual #46                 // Method java/lang/String.trim:()Ljava/lang/String;
        68: astore_3
        69: aload_0
        70: getstatic     #67                 // Field EQS:Ljava/util/function/IntPredicate;
        73: invokevirtual #59                 // Method match:(Ljava/util/function/IntPredicate;)Z
        76: ifeq          117
        79: aload_2
        80: aload_3
        81: aload_0
        82: invokevirtual #42                 // Method scanID:()Ljava/lang/String;
        85: invokevirtual #46                 // Method java/lang/String.trim:()Ljava/lang/String;
        88: invokeinterface #49,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        93: pop
        94: aload_0
        95: getstatic     #70                 // Field AMP:Ljava/util/function/IntPredicate;
        98: invokevirtual #59                 // Method match:(Ljava/util/function/IntPredicate;)Z
       101: ifeq          107
       104: goto          54
       107: aload_0
       108: invokevirtual #63                 // Method eof:()Z
       111: ifeq          117
       114: goto          147
       117: aload_0
       118: getstatic     #70                 // Field AMP:Ljava/util/function/IntPredicate;
       121: invokevirtual #59                 // Method match:(Ljava/util/function/IntPredicate;)Z
       124: ifne          134
       127: aload_0
       128: invokevirtual #63                 // Method eof:()Z
       131: ifeq          147
       134: aload_2
       135: aload_3
       136: ldc           #73                 // String
       138: invokeinterface #49,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       143: pop
       144: goto          54
       147: aload_2
       148: areturn
      LineNumberTable:
        line 52: 0
        line 53: 15
        line 55: 20
        line 56: 28
        line 57: 44
        line 59: 54
        line 61: 61
        line 62: 69
        line 64: 79
        line 65: 94
        line 66: 104
        line 68: 107
        line 69: 114
        line 72: 117
        line 74: 134
        line 75: 144
        line 80: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           69      78     3   key   Ljava/lang/String;
            0     149     0  this   Lext/mods/commons/util/QueryParser;
            0     149     1 input   Ljava/lang/String;
           28     121     2 props   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           28     121     2 props   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class java/util/Map ]
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ class java/lang/String ]
        frame_type = 9 /* same */
        frame_type = 16 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
    Signature: #126                         // (Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;

  public boolean is(java.util.function.IntPredicate);
    descriptor: (Ljava/util/function/IntPredicate;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #63                 // Method eof:()Z
         4: ifne          24
         7: aload_1
         8: aload_0
         9: invokevirtual #81                 // Method peek:()I
        12: invokeinterface #84,  2           // InterfaceMethod java/util/function/IntPredicate.test:(I)Z
        17: ifeq          24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/commons/util/QueryParser;
            0      26     1 predicate   Ljava/util/function/IntPredicate;
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean match(java.util.function.IntPredicate);
    descriptor: (Ljava/util/function/IntPredicate;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #90                 // Method is:(Ljava/util/function/IntPredicate;)Z
         5: ifeq          14
         8: aload_0
         9: invokevirtual #93                 // Method consume:()V
        12: iconst_1
        13: ireturn
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 100: 0
        line 102: 8
        line 103: 12
        line 107: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/util/QueryParser;
            0      16     1 predicate   Ljava/util/function/IntPredicate;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public static java.util.Map<java.lang.String, java.lang.String> parse(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: new           #8                  // class ext/mods/commons/util/QueryParser
         3: dup
         4: invokespecial #96                 // Method "<init>":()V
         7: aload_0
         8: invokevirtual #97                 // Method scan:(Ljava/lang/String;)Ljava/util/Map;
        11: areturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0 input   Ljava/lang/String;
    Signature: #126                         // (Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: invokedynamic #101,  0            // InvokeDynamic #0:test:()Ljava/util/function/IntPredicate;
         5: putstatic     #55                 // Field QST:Ljava/util/function/IntPredicate;
         8: invokedynamic #104,  0            // InvokeDynamic #1:test:()Ljava/util/function/IntPredicate;
        13: putstatic     #67                 // Field EQS:Ljava/util/function/IntPredicate;
        16: invokedynamic #105,  0            // InvokeDynamic #2:test:()Ljava/util/function/IntPredicate;
        21: putstatic     #70                 // Field AMP:Ljava/util/function/IntPredicate;
        24: getstatic     #55                 // Field QST:Ljava/util/function/IntPredicate;
        27: getstatic     #67                 // Field EQS:Ljava/util/function/IntPredicate;
        30: invokeinterface #106,  2          // InterfaceMethod java/util/function/IntPredicate.or:(Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;
        35: getstatic     #70                 // Field AMP:Ljava/util/function/IntPredicate;
        38: invokeinterface #106,  2          // InterfaceMethod java/util/function/IntPredicate.or:(Ljava/util/function/IntPredicate;)Ljava/util/function/IntPredicate;
        43: invokeinterface #110,  1          // InterfaceMethod java/util/function/IntPredicate.negate:()Ljava/util/function/IntPredicate;
        48: putstatic     #75                 // Field CH:Ljava/util/function/IntPredicate;
        51: return
      LineNumberTable:
        line 111: 0
        line 112: 8
        line 113: 16
        line 114: 24
}
SourceFile: "QueryParser.java"
BootstrapMethods:
  0: #147 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #137 (I)Z
      #138 REF_invokeStatic ext/mods/commons/util/QueryParser.lambda$static$0:(I)Z
      #137 (I)Z
  1: #147 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #137 (I)Z
      #141 REF_invokeStatic ext/mods/commons/util/QueryParser.lambda$static$1:(I)Z
      #137 (I)Z
  2: #147 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #137 (I)Z
      #144 REF_invokeStatic ext/mods/commons/util/QueryParser.lambda$static$2:(I)Z
      #137 (I)Z
InnerClasses:
  public static final #159= #155 of #157; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
