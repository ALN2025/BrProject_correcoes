// Bytecode for: ext.mods.commons.logging.filter.DropFilter
// File: ext\mods\commons\logging\filter\DropFilter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/filter/DropFilter.class
  Last modified 9 de jul de 2026; size 1726 bytes
  MD5 checksum af70f61c9b9d0e9c275a273ca2f971f9
  Compiled from "DropFilter.java"
public class ext.mods.commons.logging.filter.DropFilter implements java.util.logging.Filter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #30                         // ext/mods/commons/logging/filter/DropFilter
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/util/logging/LogRecord.getLoggerName:()Ljava/lang/String;
   #8 = Class              #10            // java/util/logging/LogRecord
   #9 = NameAndType        #11:#12        // getLoggerName:()Ljava/lang/String;
  #10 = Utf8               java/util/logging/LogRecord
  #11 = Utf8               getLoggerName
  #12 = Utf8               ()Ljava/lang/String;
  #13 = String             #14            // drop
  #14 = Utf8               drop
  #15 = Methodref          #16.#17        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #16 = Class              #18            // java/lang/String
  #17 = NameAndType        #19:#20        // equals:(Ljava/lang/Object;)Z
  #18 = Utf8               java/lang/String
  #19 = Utf8               equals
  #20 = Utf8               (Ljava/lang/Object;)Z
  #21 = Methodref          #8.#22         // java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
  #22 = NameAndType        #23:#12        // getMessage:()Ljava/lang/String;
  #23 = Utf8               getMessage
  #24 = String             #25            // :
  #25 = Utf8               :
  #26 = Methodref          #16.#27        // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #27 = NameAndType        #28:#29        // split:(Ljava/lang/String;)[Ljava/lang/String;
  #28 = Utf8               split
  #29 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #30 = Class              #31            // ext/mods/commons/logging/filter/DropFilter
  #31 = Utf8               ext/mods/commons/logging/filter/DropFilter
  #32 = String             #33            // Consume
  #33 = Utf8               Consume
  #34 = Methodref          #16.#35        // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #35 = NameAndType        #36:#37        // contains:(Ljava/lang/CharSequence;)Z
  #36 = Utf8               contains
  #37 = Utf8               (Ljava/lang/CharSequence;)Z
  #38 = Methodref          #8.#39         // java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
  #39 = NameAndType        #40:#41        // getParameters:()[Ljava/lang/Object;
  #40 = Utf8               getParameters
  #41 = Utf8               ()[Ljava/lang/Object;
  #42 = Class              #43            // ext/mods/gameserver/model/item/instance/ItemInstance
  #43 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #44 = Fieldref           #30.#45        // ext/mods/commons/logging/filter/DropFilter.EXCLUDE_TYPE:[Lext/mods/gameserver/enums/items/EtcItemType;
  #45 = NameAndType        #46:#47        // EXCLUDE_TYPE:[Lext/mods/gameserver/enums/items/EtcItemType;
  #46 = Utf8               EXCLUDE_TYPE
  #47 = Utf8               [Lext/mods/gameserver/enums/items/EtcItemType;
  #48 = Methodref          #42.#49        // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #49 = NameAndType        #50:#51        // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #50 = Utf8               getItemType
  #51 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #52 = Methodref          #53.#54        // ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
  #53 = Class              #55            // ext/mods/commons/util/ArraysUtil
  #54 = NameAndType        #36:#56        // contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
  #55 = Utf8               ext/mods/commons/util/ArraysUtil
  #56 = Utf8               ([Ljava/lang/Object;Ljava/lang/Object;)Z
  #57 = Class              #58            // ext/mods/gameserver/enums/items/EtcItemType
  #58 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
  #59 = Fieldref           #57.#60        // ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
  #60 = NameAndType        #61:#62        // ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
  #61 = Utf8               ARROW
  #62 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
  #63 = Fieldref           #57.#64        // ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
  #64 = NameAndType        #65:#62        // SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
  #65 = Utf8               SHOT
  #66 = Fieldref           #57.#67        // ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
  #67 = NameAndType        #68:#62        // HERB:Lext/mods/gameserver/enums/items/EtcItemType;
  #68 = Utf8               HERB
  #69 = Class              #70            // java/util/logging/Filter
  #70 = Utf8               java/util/logging/Filter
  #71 = Utf8               EXCLUDE_PROCESS
  #72 = Utf8               Ljava/lang/String;
  #73 = Utf8               ConstantValue
  #74 = Utf8               Code
  #75 = Utf8               LineNumberTable
  #76 = Utf8               LocalVariableTable
  #77 = Utf8               this
  #78 = Utf8               Lext/mods/commons/logging/filter/DropFilter;
  #79 = Utf8               isLoggable
  #80 = Utf8               (Ljava/util/logging/LogRecord;)Z
  #81 = Utf8               logRecord
  #82 = Utf8               Ljava/util/logging/LogRecord;
  #83 = Utf8               messageList
  #84 = Utf8               [Ljava/lang/String;
  #85 = Utf8               item
  #86 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #87 = Utf8               StackMapTable
  #88 = Class              #84            // "[Ljava/lang/String;"
  #89 = Utf8               <clinit>
  #90 = Utf8               SourceFile
  #91 = Utf8               DropFilter.java
{
  public ext.mods.commons.logging.filter.DropFilter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/filter/DropFilter;

  public boolean isLoggable(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: invokevirtual #7                  // Method java/util/logging/LogRecord.getLoggerName:()Ljava/lang/String;
         4: ldc           #13                 // String drop
         6: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         9: ifne          14
        12: iconst_0
        13: ireturn
        14: aload_1
        15: invokevirtual #21                 // Method java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
        18: ldc           #24                 // String :
        20: invokevirtual #26                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        23: astore_2
        24: aload_2
        25: arraylength
        26: iconst_2
        27: if_icmplt     41
        30: ldc           #32                 // String Consume
        32: aload_2
        33: iconst_1
        34: aaload
        35: invokevirtual #34                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        38: ifne          43
        41: iconst_1
        42: ireturn
        43: aload_1
        44: invokevirtual #38                 // Method java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
        47: iconst_1
        48: aaload
        49: checkcast     #42                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        52: astore_3
        53: getstatic     #44                 // Field EXCLUDE_TYPE:[Lext/mods/gameserver/enums/items/EtcItemType;
        56: aload_3
        57: invokevirtual #48                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        60: invokestatic  #52                 // Method ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
        63: ifne          70
        66: iconst_1
        67: goto          71
        70: iconst_0
        71: ireturn
      LineNumberTable:
        line 41: 0
        line 42: 12
        line 44: 14
        line 45: 24
        line 46: 41
        line 48: 43
        line 49: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/commons/logging/filter/DropFilter;
            0      72     1 logRecord   Ljava/util/logging/LogRecord;
           24      48     2 messageList   [Ljava/lang/String;
           53      19     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 5
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #57                 // class ext/mods/gameserver/enums/items/EtcItemType
         4: dup
         5: iconst_0
         6: getstatic     #59                 // Field ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #63                 // Field ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
        15: aastore
        16: dup
        17: iconst_2
        18: getstatic     #66                 // Field ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
        21: aastore
        22: putstatic     #44                 // Field EXCLUDE_TYPE:[Lext/mods/gameserver/enums/items/EtcItemType;
        25: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "DropFilter.java"
