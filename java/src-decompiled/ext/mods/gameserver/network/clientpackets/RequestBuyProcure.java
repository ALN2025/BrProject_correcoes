// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestBuyProcure
// File: ext\mods\gameserver\network\clientpackets\RequestBuyProcure.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestBuyProcure.class
  Last modified 9 de jul de 2026; size 1753 bytes
  MD5 checksum 83e0689cd0e777617ec61e48abac26be
  Compiled from "RequestBuyProcure.java"
public class ext.mods.gameserver.network.clientpackets.RequestBuyProcure extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestBuyProcure
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 3, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/RequestBuyProcure.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/RequestBuyProcure
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBuyProcure
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/RequestBuyProcure._manorId:I
  #14 = NameAndType        #15:#16        // _manorId:I
  #15 = Utf8               _manorId
  #16 = Utf8               I
  #17 = Fieldref           #18.#19        // ext/mods/Config.MAX_ITEM_IN_PACKET:I
  #18 = Class              #20            // ext/mods/Config
  #19 = NameAndType        #21:#16        // MAX_ITEM_IN_PACKET:I
  #20 = Utf8               ext/mods/Config
  #21 = Utf8               MAX_ITEM_IN_PACKET
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/network/clientpackets/RequestBuyProcure._buf:Ljava/nio/ByteBuffer;
  #23 = NameAndType        #24:#25        // _buf:Ljava/nio/ByteBuffer;
  #24 = Utf8               _buf
  #25 = Utf8               Ljava/nio/ByteBuffer;
  #26 = Methodref          #27.#28        // java/nio/ByteBuffer.remaining:()I
  #27 = Class              #29            // java/nio/ByteBuffer
  #28 = NameAndType        #30:#12        // remaining:()I
  #29 = Utf8               java/nio/ByteBuffer
  #30 = Utf8               remaining
  #31 = Class              #32            // java/util/ArrayList
  #32 = Utf8               java/util/ArrayList
  #33 = Methodref          #31.#34        // java/util/ArrayList."<init>":(I)V
  #34 = NameAndType        #5:#35         // "<init>":(I)V
  #35 = Utf8               (I)V
  #36 = Fieldref           #8.#37         // ext/mods/gameserver/network/clientpackets/RequestBuyProcure._items:Ljava/util/List;
  #37 = NameAndType        #38:#39        // _items:Ljava/util/List;
  #38 = Utf8               _items
  #39 = Utf8               Ljava/util/List;
  #40 = Class              #41            // ext/mods/gameserver/model/holder/IntIntHolder
  #41 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #42 = Methodref          #40.#43        // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #43 = NameAndType        #5:#44         // "<init>":(II)V
  #44 = Utf8               (II)V
  #45 = InterfaceMethodref #46.#47        // java/util/List.add:(Ljava/lang/Object;)Z
  #46 = Class              #48            // java/util/List
  #47 = NameAndType        #49:#50        // add:(Ljava/lang/Object;)Z
  #48 = Utf8               java/util/List
  #49 = Utf8               add
  #50 = Utf8               (Ljava/lang/Object;)Z
  #51 = Fieldref           #8.#52         // ext/mods/gameserver/network/clientpackets/RequestBuyProcure.LOGGER:Lext/mods/commons/logging/CLogger;
  #52 = NameAndType        #53:#54        // LOGGER:Lext/mods/commons/logging/CLogger;
  #53 = Utf8               LOGGER
  #54 = Utf8               Lext/mods/commons/logging/CLogger;
  #55 = String             #56            // RequestBuyProcure: normally unused, but found {} infos for manorId {}.
  #56 = Utf8               RequestBuyProcure: normally unused, but found {} infos for manorId {}.
  #57 = Class              #58            // java/lang/Object
  #58 = Utf8               java/lang/Object
  #59 = InterfaceMethodref #46.#60        // java/util/List.size:()I
  #60 = NameAndType        #61:#12        // size:()I
  #61 = Utf8               size
  #62 = Methodref          #63.#64        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #63 = Class              #65            // java/lang/Integer
  #64 = NameAndType        #66:#67        // valueOf:(I)Ljava/lang/Integer;
  #65 = Utf8               java/lang/Integer
  #66 = Utf8               valueOf
  #67 = Utf8               (I)Ljava/lang/Integer;
  #68 = Methodref          #69.#70        // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #69 = Class              #71            // ext/mods/commons/logging/CLogger
  #70 = NameAndType        #72:#73        // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #71 = Utf8               ext/mods/commons/logging/CLogger
  #72 = Utf8               warn
  #73 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #74 = Utf8               BATCH_LENGTH
  #75 = Utf8               ConstantValue
  #76 = Integer            8
  #77 = Utf8               Signature
  #78 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #79 = Utf8               Code
  #80 = Utf8               LineNumberTable
  #81 = Utf8               LocalVariableTable
  #82 = Utf8               this
  #83 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestBuyProcure;
  #84 = Utf8               readImpl
  #85 = Utf8               itemId
  #86 = Utf8               cnt
  #87 = Utf8               i
  #88 = Utf8               count
  #89 = Utf8               StackMapTable
  #90 = Utf8               runImpl
  #91 = Utf8               SourceFile
  #92 = Utf8               RequestBuyProcure.java
{
  public ext.mods.gameserver.network.clientpackets.RequestBuyProcure();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestBuyProcure;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=5, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _manorId:I
         8: aload_0
         9: invokevirtual #7                  // Method readD:()I
        12: istore_1
        13: iload_1
        14: ifle          38
        17: iload_1
        18: getstatic     #17                 // Field ext/mods/Config.MAX_ITEM_IN_PACKET:I
        21: if_icmpgt     38
        24: iload_1
        25: bipush        8
        27: imul
        28: aload_0
        29: getfield      #22                 // Field _buf:Ljava/nio/ByteBuffer;
        32: invokevirtual #26                 // Method java/nio/ByteBuffer.remaining:()I
        35: if_icmpeq     39
        38: return
        39: aload_0
        40: new           #31                 // class java/util/ArrayList
        43: dup
        44: iload_1
        45: invokespecial #33                 // Method java/util/ArrayList."<init>":(I)V
        48: putfield      #36                 // Field _items:Ljava/util/List;
        51: iconst_0
        52: istore_2
        53: iload_2
        54: iload_1
        55: if_icmpge     117
        58: aload_0
        59: invokevirtual #7                  // Method readD:()I
        62: pop
        63: aload_0
        64: invokevirtual #7                  // Method readD:()I
        67: istore_3
        68: aload_0
        69: invokevirtual #7                  // Method readD:()I
        72: istore        4
        74: iload_3
        75: iconst_1
        76: if_icmplt     85
        79: iload         4
        81: iconst_1
        82: if_icmpge     91
        85: aload_0
        86: aconst_null
        87: putfield      #36                 // Field _items:Ljava/util/List;
        90: return
        91: aload_0
        92: getfield      #36                 // Field _items:Ljava/util/List;
        95: new           #40                 // class ext/mods/gameserver/model/holder/IntIntHolder
        98: dup
        99: iload_3
       100: iload         4
       102: invokespecial #42                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       105: invokeinterface #45,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       110: pop
       111: iinc          2, 1
       114: goto          53
       117: return
      LineNumberTable:
        line 36: 0
        line 38: 8
        line 39: 13
        line 40: 38
        line 42: 39
        line 43: 51
        line 45: 58
        line 46: 63
        line 47: 68
        line 49: 74
        line 51: 85
        line 52: 90
        line 55: 91
        line 43: 111
        line 57: 117
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           68      43     3 itemId   I
           74      37     4   cnt   I
           53      64     2     i   I
            0     118     0  this   Lext/mods/gameserver/network/clientpackets/RequestBuyProcure;
           13     105     1 count   I
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ int ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ int, int ]
        frame_type = 5 /* same */
        frame_type = 248 /* chop */
          offset_delta = 25

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=1, args_size=1
         0: getstatic     #51                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc           #55                 // String RequestBuyProcure: normally unused, but found {} infos for manorId {}.
         5: iconst_2
         6: anewarray     #57                 // class java/lang/Object
         9: dup
        10: iconst_0
        11: aload_0
        12: getfield      #36                 // Field _items:Ljava/util/List;
        15: invokeinterface #59,  1           // InterfaceMethod java/util/List.size:()I
        20: invokestatic  #62                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: aastore
        24: dup
        25: iconst_1
        26: aload_0
        27: getfield      #13                 // Field _manorId:I
        30: invokestatic  #62                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        33: aastore
        34: invokevirtual #68                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        37: return
      LineNumberTable:
        line 62: 0
        line 63: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/network/clientpackets/RequestBuyProcure;
}
SourceFile: "RequestBuyProcure.java"
