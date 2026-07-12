// Bytecode for: ext.mods.gameserver.model.item.MercenaryTicket
// File: ext\mods\gameserver\model\item\MercenaryTicket.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/MercenaryTicket.class
  Last modified 9 de jul de 2026; size 2204 bytes
  MD5 checksum 59ddb19ae0fc779f7fdf2f7017daab7d
  Compiled from "MercenaryTicket.java"
public final class ext.mods.gameserver.model.item.MercenaryTicket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/item/MercenaryTicket
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // itemId
    #8 = Utf8               itemId
    #9 = Methodref          #10.#11       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #10 = Class              #12           // ext/mods/commons/data/StatSet
   #11 = NameAndType        #13:#14       // getInteger:(Ljava/lang/String;)I
   #12 = Utf8               ext/mods/commons/data/StatSet
   #13 = Utf8               getInteger
   #14 = Utf8               (Ljava/lang/String;)I
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/model/item/MercenaryTicket._itemId:I
   #16 = Class              #18           // ext/mods/gameserver/model/item/MercenaryTicket
   #17 = NameAndType        #19:#20       // _itemId:I
   #18 = Utf8               ext/mods/gameserver/model/item/MercenaryTicket
   #19 = Utf8               _itemId
   #20 = Utf8               I
   #21 = String             #22           // type
   #22 = Utf8               type
   #23 = Class              #24           // ext/mods/gameserver/enums/items/TicketType
   #24 = Utf8               ext/mods/gameserver/enums/items/TicketType
   #25 = Methodref          #10.#26       // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #26 = NameAndType        #27:#28       // getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #27 = Utf8               getEnum
   #28 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #29 = Fieldref           #16.#30       // ext/mods/gameserver/model/item/MercenaryTicket._type:Lext/mods/gameserver/enums/items/TicketType;
   #30 = NameAndType        #31:#32       // _type:Lext/mods/gameserver/enums/items/TicketType;
   #31 = Utf8               _type
   #32 = Utf8               Lext/mods/gameserver/enums/items/TicketType;
   #33 = String             #34           // stationary
   #34 = Utf8               stationary
   #35 = Methodref          #10.#36       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
   #36 = NameAndType        #37:#38       // getBool:(Ljava/lang/String;)Z
   #37 = Utf8               getBool
   #38 = Utf8               (Ljava/lang/String;)Z
   #39 = Fieldref           #16.#40       // ext/mods/gameserver/model/item/MercenaryTicket._isStationary:Z
   #40 = NameAndType        #41:#42       // _isStationary:Z
   #41 = Utf8               _isStationary
   #42 = Utf8               Z
   #43 = String             #44           // npcId
   #44 = Utf8               npcId
   #45 = Fieldref           #16.#46       // ext/mods/gameserver/model/item/MercenaryTicket._npcId:I
   #46 = NameAndType        #47:#20       // _npcId:I
   #47 = Utf8               _npcId
   #48 = String             #49           // maxAmount
   #49 = Utf8               maxAmount
   #50 = Fieldref           #16.#51       // ext/mods/gameserver/model/item/MercenaryTicket._maxAmount:I
   #51 = NameAndType        #52:#20       // _maxAmount:I
   #52 = Utf8               _maxAmount
   #53 = String             #54           // ssq
   #54 = Utf8               ssq
   #55 = Methodref          #10.#56       // ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
   #56 = NameAndType        #57:#58       // getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
   #57 = Utf8               getStringArray
   #58 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #59 = Class              #60           // ext/mods/gameserver/enums/CabalType
   #60 = Utf8               ext/mods/gameserver/enums/CabalType
   #61 = Fieldref           #16.#62       // ext/mods/gameserver/model/item/MercenaryTicket._ssq:[Lext/mods/gameserver/enums/CabalType;
   #62 = NameAndType        #63:#64       // _ssq:[Lext/mods/gameserver/enums/CabalType;
   #63 = Utf8               _ssq
   #64 = Utf8               [Lext/mods/gameserver/enums/CabalType;
   #65 = Methodref          #66.#67       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #66 = Class              #68           // java/lang/Enum
   #67 = NameAndType        #69:#70       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #68 = Utf8               java/lang/Enum
   #69 = Utf8               valueOf
   #70 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #71 = Methodref          #72.#73       // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #72 = Class              #74           // java/util/Arrays
   #73 = NameAndType        #75:#76       // asList:([Ljava/lang/Object;)Ljava/util/List;
   #74 = Utf8               java/util/Arrays
   #75 = Utf8               asList
   #76 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #77 = InterfaceMethodref #78.#79       // java/util/List.contains:(Ljava/lang/Object;)Z
   #78 = Class              #80           // java/util/List
   #79 = NameAndType        #81:#82       // contains:(Ljava/lang/Object;)Z
   #80 = Utf8               java/util/List
   #81 = Utf8               contains
   #82 = Utf8               (Ljava/lang/Object;)Z
   #83 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #84 = Utf8               Code
   #85 = Utf8               LineNumberTable
   #86 = Utf8               LocalVariableTable
   #87 = Utf8               i
   #88 = Utf8               this
   #89 = Utf8               Lext/mods/gameserver/model/item/MercenaryTicket;
   #90 = Utf8               set
   #91 = Utf8               Lext/mods/commons/data/StatSet;
   #92 = Utf8               [Ljava/lang/String;
   #93 = Utf8               StackMapTable
   #94 = Class              #92           // "[Ljava/lang/String;"
   #95 = Utf8               getItemId
   #96 = Utf8               ()I
   #97 = Utf8               getType
   #98 = Utf8               ()Lext/mods/gameserver/enums/items/TicketType;
   #99 = Utf8               isStationary
  #100 = Utf8               ()Z
  #101 = Utf8               getNpcId
  #102 = Utf8               getMaxAmount
  #103 = Utf8               isSsqType
  #104 = Utf8               (Lext/mods/gameserver/enums/CabalType;)Z
  #105 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #106 = Utf8               SourceFile
  #107 = Utf8               MercenaryTicket.java
{
  public ext.mods.gameserver.model.item.MercenaryTicket(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String itemId
         8: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: putfield      #15                 // Field _itemId:I
        14: aload_0
        15: aload_1
        16: ldc           #21                 // String type
        18: ldc           #23                 // class ext/mods/gameserver/enums/items/TicketType
        20: invokevirtual #25                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
        23: checkcast     #23                 // class ext/mods/gameserver/enums/items/TicketType
        26: putfield      #29                 // Field _type:Lext/mods/gameserver/enums/items/TicketType;
        29: aload_0
        30: aload_1
        31: ldc           #33                 // String stationary
        33: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
        36: putfield      #39                 // Field _isStationary:Z
        39: aload_0
        40: aload_1
        41: ldc           #43                 // String npcId
        43: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        46: putfield      #45                 // Field _npcId:I
        49: aload_0
        50: aload_1
        51: ldc           #48                 // String maxAmount
        53: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        56: putfield      #50                 // Field _maxAmount:I
        59: aload_1
        60: ldc           #53                 // String ssq
        62: invokevirtual #55                 // Method ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
        65: astore_2
        66: aload_0
        67: aload_2
        68: arraylength
        69: anewarray     #59                 // class ext/mods/gameserver/enums/CabalType
        72: putfield      #61                 // Field _ssq:[Lext/mods/gameserver/enums/CabalType;
        75: iconst_0
        76: istore_3
        77: iload_3
        78: aload_2
        79: arraylength
        80: if_icmpge     106
        83: aload_0
        84: getfield      #61                 // Field _ssq:[Lext/mods/gameserver/enums/CabalType;
        87: iload_3
        88: ldc           #59                 // class ext/mods/gameserver/enums/CabalType
        90: aload_2
        91: iload_3
        92: aaload
        93: invokestatic  #65                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        96: checkcast     #59                 // class ext/mods/gameserver/enums/CabalType
        99: aastore
       100: iinc          3, 1
       103: goto          77
       106: return
      LineNumberTable:
        line 37: 0
        line 38: 4
        line 39: 14
        line 40: 29
        line 41: 39
        line 42: 49
        line 44: 59
        line 46: 66
        line 47: 75
        line 48: 83
        line 47: 100
        line 49: 106
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           77      29     3     i   I
            0     107     0  this   Lext/mods/gameserver/model/item/MercenaryTicket;
            0     107     1   set   Lext/mods/commons/data/StatSet;
           66      41     2   ssq   [Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 77
          locals = [ class ext/mods/gameserver/model/item/MercenaryTicket, class ext/mods/commons/data/StatSet, class "[Ljava/lang/String;", int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 28

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/MercenaryTicket;

  public ext.mods.gameserver.enums.items.TicketType getType();
    descriptor: ()Lext/mods/gameserver/enums/items/TicketType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _type:Lext/mods/gameserver/enums/items/TicketType;
         4: areturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/MercenaryTicket;

  public boolean isStationary();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _isStationary:Z
         4: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/MercenaryTicket;

  public int getNpcId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _npcId:I
         4: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/MercenaryTicket;

  public int getMaxAmount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _maxAmount:I
         4: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/MercenaryTicket;

  public boolean isSsqType(ext.mods.gameserver.enums.CabalType);
    descriptor: (Lext/mods/gameserver/enums/CabalType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #61                 // Field _ssq:[Lext/mods/gameserver/enums/CabalType;
         4: invokestatic  #71                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         7: aload_1
         8: invokeinterface #77,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/item/MercenaryTicket;
            0      14     1  type   Lext/mods/gameserver/enums/CabalType;
}
SourceFile: "MercenaryTicket.java"
