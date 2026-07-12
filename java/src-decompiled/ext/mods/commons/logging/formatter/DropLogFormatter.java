// Bytecode for: ext.mods.commons.logging.formatter.DropLogFormatter
// File: ext\mods\commons\logging\formatter\DropLogFormatter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/formatter/DropLogFormatter.class
  Last modified 9 de jul de 2026; size 2306 bytes
  MD5 checksum fe580c95c1f861bfc0d5956d6d4bcb9d
  Compiled from "DropLogFormatter.java"
public class ext.mods.commons.logging.formatter.DropLogFormatter extends ext.mods.commons.logging.MasterFormatter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #21                         // ext/mods/commons/logging/formatter/DropLogFormatter
  super_class: #2                         // ext/mods/commons/logging/MasterFormatter
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/logging/MasterFormatter."<init>":()V
    #2 = Class              #4            // ext/mods/commons/logging/MasterFormatter
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/commons/logging/MasterFormatter
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/StringBuilder
    #8 = Utf8               java/lang/StringBuilder
    #9 = Methodref          #7.#3         // java/lang/StringBuilder."<init>":()V
   #10 = Class              #11           // java/lang/Object
   #11 = Utf8               java/lang/Object
   #12 = String             #13           // [
   #13 = Utf8               [
   #14 = Methodref          #15.#16       // java/util/logging/LogRecord.getMillis:()J
   #15 = Class              #17           // java/util/logging/LogRecord
   #16 = NameAndType        #18:#19       // getMillis:()J
   #17 = Utf8               java/util/logging/LogRecord
   #18 = Utf8               getMillis
   #19 = Utf8               ()J
   #20 = Methodref          #21.#22       // ext/mods/commons/logging/formatter/DropLogFormatter.getFormatedDate:(J)Ljava/lang/String;
   #21 = Class              #23           // ext/mods/commons/logging/formatter/DropLogFormatter
   #22 = NameAndType        #24:#25       // getFormatedDate:(J)Ljava/lang/String;
   #23 = Utf8               ext/mods/commons/logging/formatter/DropLogFormatter
   #24 = Utf8               getFormatedDate
   #25 = Utf8               (J)Ljava/lang/String;
   #26 = String             #27           // ]
   #27 = Utf8               ]
   #28 = String             #29           // \t
   #29 = Utf8               \t
   #30 = Methodref          #15.#31       // java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
   #31 = NameAndType        #32:#33       // getMessage:()Ljava/lang/String;
   #32 = Utf8               getMessage
   #33 = Utf8               ()Ljava/lang/String;
   #34 = Methodref          #35.#36       // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #35 = Class              #37           // ext/mods/commons/lang/StringUtil
   #36 = NameAndType        #38:#39       // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #37 = Utf8               ext/mods/commons/lang/StringUtil
   #38 = Utf8               append
   #39 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #40 = Methodref          #15.#41       // java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
   #41 = NameAndType        #42:#43       // getParameters:()[Ljava/lang/Object;
   #42 = Utf8               getParameters
   #43 = Utf8               ()[Ljava/lang/Object;
   #44 = Class              #45           // ext/mods/gameserver/model/item/instance/ItemInstance
   #45 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #46 = Methodref          #44.#47       // ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #47 = NameAndType        #48:#49       // getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #48 = Utf8               getLocation
   #49 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
   #50 = Methodref          #44.#51       // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
   #51 = NameAndType        #52:#53       // getCount:()I
   #52 = Utf8               getCount
   #53 = Utf8               ()I
   #54 = Methodref          #55.#56       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #55 = Class              #57           // java/lang/Integer
   #56 = NameAndType        #58:#59       // valueOf:(I)Ljava/lang/Integer;
   #57 = Utf8               java/lang/Integer
   #58 = Utf8               valueOf
   #59 = Utf8               (I)Ljava/lang/Integer;
   #60 = Methodref          #44.#61       // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #61 = NameAndType        #62:#53       // getEnchantLevel:()I
   #62 = Utf8               getEnchantLevel
   #63 = InvokeDynamic      #0:#64        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #64 = NameAndType        #65:#66       // makeConcatWithConstants:(I)Ljava/lang/String;
   #65 = Utf8               makeConcatWithConstants
   #66 = Utf8               (I)Ljava/lang/String;
   #67 = String             #68           //
   #68 = Utf8
   #69 = Methodref          #10.#70       // java/lang/Object.toString:()Ljava/lang/String;
   #70 = NameAndType        #71:#33       // toString:()Ljava/lang/String;
   #71 = Utf8               toString
   #72 = String             #73           // \r\n
   #73 = Utf8               \r\n
   #74 = Methodref          #7.#75        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #75 = NameAndType        #38:#76       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #76 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #77 = Methodref          #7.#70        // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #78 = Utf8               Code
   #79 = Utf8               LineNumberTable
   #80 = Utf8               LocalVariableTable
   #81 = Utf8               this
   #82 = Utf8               Lext/mods/commons/logging/formatter/DropLogFormatter;
   #83 = Utf8               format
   #84 = Utf8               (Ljava/util/logging/LogRecord;)Ljava/lang/String;
   #85 = Utf8               item
   #86 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #87 = Utf8               p
   #88 = Utf8               Ljava/lang/Object;
   #89 = Utf8               logRecord
   #90 = Utf8               Ljava/util/logging/LogRecord;
   #91 = Utf8               sb
   #92 = Utf8               Ljava/lang/StringBuilder;
   #93 = Utf8               StackMapTable
   #94 = Class              #95           // "[Ljava/lang/Object;"
   #95 = Utf8               [Ljava/lang/Object;
   #96 = Class              #97           // java/lang/String
   #97 = Utf8               java/lang/String
   #98 = Utf8               SourceFile
   #99 = Utf8               DropLogFormatter.java
  #100 = Utf8               BootstrapMethods
  #101 = String             #102          //  +\u0001
  #102 = Utf8                +\u0001
  #103 = MethodHandle       6:#104        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Methodref          #105.#106     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #105 = Class              #107          // java/lang/invoke/StringConcatFactory
  #106 = NameAndType        #65:#108      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #107 = Utf8               java/lang/invoke/StringConcatFactory
  #108 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #109 = Utf8               InnerClasses
  #110 = Class              #111          // java/lang/invoke/MethodHandles$Lookup
  #111 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #112 = Class              #113          // java/lang/invoke/MethodHandles
  #113 = Utf8               java/lang/invoke/MethodHandles
  #114 = Utf8               Lookup
{
  public ext.mods.commons.logging.formatter.DropLogFormatter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/logging/MasterFormatter."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/formatter/DropLogFormatter;

  public java.lang.String format(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=2
         0: new           #7                  // class java/lang/StringBuilder
         3: dup
         4: invokespecial #9                  // Method java/lang/StringBuilder."<init>":()V
         7: astore_2
         8: aload_2
         9: iconst_5
        10: anewarray     #10                 // class java/lang/Object
        13: dup
        14: iconst_0
        15: ldc           #12                 // String [
        17: aastore
        18: dup
        19: iconst_1
        20: aload_1
        21: invokevirtual #14                 // Method java/util/logging/LogRecord.getMillis:()J
        24: invokestatic  #20                 // Method getFormatedDate:(J)Ljava/lang/String;
        27: aastore
        28: dup
        29: iconst_2
        30: ldc           #26                 // String ]
        32: aastore
        33: dup
        34: iconst_3
        35: ldc           #28                 // String \t
        37: aastore
        38: dup
        39: iconst_4
        40: aload_1
        41: invokevirtual #30                 // Method java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
        44: aastore
        45: invokestatic  #34                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        48: aload_1
        49: invokevirtual #40                 // Method java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
        52: astore_3
        53: aload_3
        54: arraylength
        55: istore        4
        57: iconst_0
        58: istore        5
        60: iload         5
        62: iload         4
        64: if_icmpge     198
        67: aload_3
        68: iload         5
        70: aaload
        71: astore        6
        73: aload         6
        75: ifnonnull     81
        78: goto          192
        81: aload         6
        83: instanceof    #44                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        86: ifeq          171
        89: aload         6
        91: checkcast     #44                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        94: astore        7
        96: aload_2
        97: bipush        6
        99: anewarray     #10                 // class java/lang/Object
       102: dup
       103: iconst_0
       104: ldc           #28                 // String \t
       106: aastore
       107: dup
       108: iconst_1
       109: aload         7
       111: invokevirtual #46                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
       114: aastore
       115: dup
       116: iconst_2
       117: ldc           #28                 // String \t
       119: aastore
       120: dup
       121: iconst_3
       122: aload         7
       124: invokevirtual #50                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       127: invokestatic  #54                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       130: aastore
       131: dup
       132: iconst_4
       133: aload         7
       135: invokevirtual #60                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       138: ifle          154
       141: aload         7
       143: invokevirtual #60                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       146: invokedynamic #63,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       151: goto          156
       154: ldc           #67                 // String
       156: aastore
       157: dup
       158: iconst_5
       159: aload         6
       161: invokevirtual #69                 // Method java/lang/Object.toString:()Ljava/lang/String;
       164: aastore
       165: invokestatic  #34                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       168: goto          192
       171: aload_2
       172: iconst_2
       173: anewarray     #10                 // class java/lang/Object
       176: dup
       177: iconst_0
       178: ldc           #28                 // String \t
       180: aastore
       181: dup
       182: iconst_1
       183: aload         6
       185: invokevirtual #69                 // Method java/lang/Object.toString:()Ljava/lang/String;
       188: aastore
       189: invokestatic  #34                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       192: iinc          5, 1
       195: goto          60
       198: aload_2
       199: ldc           #72                 // String \r\n
       201: invokevirtual #74                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       204: pop
       205: aload_2
       206: invokevirtual #77                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       209: areturn
      LineNumberTable:
        line 32: 0
        line 34: 8
        line 36: 48
        line 38: 73
        line 39: 78
        line 41: 81
        line 42: 96
        line 44: 171
        line 36: 192
        line 46: 198
        line 48: 205
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           96      75     7  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           73     119     6     p   Ljava/lang/Object;
            0     210     0  this   Lext/mods/commons/logging/formatter/DropLogFormatter;
            0     210     1 logRecord   Ljava/util/logging/LogRecord;
            8     202     2    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 7
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/commons/logging/formatter/DropLogFormatter, class java/util/logging/LogRecord, class java/lang/StringBuilder, class "[Ljava/lang/Object;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 72
          locals = [ class ext/mods/commons/logging/formatter/DropLogFormatter, class java/util/logging/LogRecord, class java/lang/StringBuilder, class "[Ljava/lang/Object;", int, int, class java/lang/Object, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/commons/logging/formatter/DropLogFormatter, class java/util/logging/LogRecord, class java/lang/StringBuilder, class "[Ljava/lang/Object;", int, int, class java/lang/Object, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 250 /* chop */
          offset_delta = 20
        frame_type = 248 /* chop */
          offset_delta = 5
}
SourceFile: "DropLogFormatter.java"
BootstrapMethods:
  0: #103 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #101  +\u0001
InnerClasses:
  public static final #114= #110 of #112; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
