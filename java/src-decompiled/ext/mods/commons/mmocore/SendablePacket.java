// Bytecode for: ext.mods.commons.mmocore.SendablePacket
// File: ext\mods\commons\mmocore\SendablePacket.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/SendablePacket.class
  Last modified 9 de jul de 2026; size 2808 bytes
  MD5 checksum 24fb46e6ef0597357696fbddeaa4d93f
  Compiled from "SendablePacket.java"
public abstract class ext.mods.commons.mmocore.SendablePacket<T extends ext.mods.commons.mmocore.MMOClient<?>> extends ext.mods.commons.mmocore.AbstractPacket<T>
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/commons/mmocore/SendablePacket
  super_class: #2                         // ext/mods/commons/mmocore/AbstractPacket
  interfaces: 0, fields: 0, methods: 11, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/mmocore/AbstractPacket."<init>":()V
    #2 = Class              #4            // ext/mods/commons/mmocore/AbstractPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/commons/mmocore/AbstractPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/mmocore/SendablePacket._buf:Ljava/nio/ByteBuffer;
    #8 = Class              #10           // ext/mods/commons/mmocore/SendablePacket
    #9 = NameAndType        #11:#12       // _buf:Ljava/nio/ByteBuffer;
   #10 = Utf8               ext/mods/commons/mmocore/SendablePacket
   #11 = Utf8               _buf
   #12 = Utf8               Ljava/nio/ByteBuffer;
   #13 = Methodref          #14.#15       // java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
   #14 = Class              #16           // java/nio/ByteBuffer
   #15 = NameAndType        #17:#18       // put:(B)Ljava/nio/ByteBuffer;
   #16 = Utf8               java/nio/ByteBuffer
   #17 = Utf8               put
   #18 = Utf8               (B)Ljava/nio/ByteBuffer;
   #19 = Methodref          #14.#20       // java/nio/ByteBuffer.putDouble:(D)Ljava/nio/ByteBuffer;
   #20 = NameAndType        #21:#22       // putDouble:(D)Ljava/nio/ByteBuffer;
   #21 = Utf8               putDouble
   #22 = Utf8               (D)Ljava/nio/ByteBuffer;
   #23 = Methodref          #14.#24       // java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
   #24 = NameAndType        #25:#26       // putShort:(S)Ljava/nio/ByteBuffer;
   #25 = Utf8               putShort
   #26 = Utf8               (S)Ljava/nio/ByteBuffer;
   #27 = Methodref          #14.#28       // java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
   #28 = NameAndType        #29:#30       // putInt:(I)Ljava/nio/ByteBuffer;
   #29 = Utf8               putInt
   #30 = Utf8               (I)Ljava/nio/ByteBuffer;
   #31 = Methodref          #14.#32       // java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
   #32 = NameAndType        #33:#34       // putLong:(J)Ljava/nio/ByteBuffer;
   #33 = Utf8               putLong
   #34 = Utf8               (J)Ljava/nio/ByteBuffer;
   #35 = Methodref          #14.#36       // java/nio/ByteBuffer.put:([B)Ljava/nio/ByteBuffer;
   #36 = NameAndType        #17:#37       // put:([B)Ljava/nio/ByteBuffer;
   #37 = Utf8               ([B)Ljava/nio/ByteBuffer;
   #38 = Methodref          #39.#40       // java/lang/String.isEmpty:()Z
   #39 = Class              #41           // java/lang/String
   #40 = NameAndType        #42:#43       // isEmpty:()Z
   #41 = Utf8               java/lang/String
   #42 = Utf8               isEmpty
   #43 = Utf8               ()Z
   #44 = Methodref          #39.#45       // java/lang/String.length:()I
   #45 = NameAndType        #46:#47       // length:()I
   #46 = Utf8               length
   #47 = Utf8               ()I
   #48 = Methodref          #39.#49       // java/lang/String.charAt:(I)C
   #49 = NameAndType        #50:#51       // charAt:(I)C
   #50 = Utf8               charAt
   #51 = Utf8               (I)C
   #52 = Methodref          #14.#53       // java/nio/ByteBuffer.putChar:(C)Ljava/nio/ByteBuffer;
   #53 = NameAndType        #54:#55       // putChar:(C)Ljava/nio/ByteBuffer;
   #54 = Utf8               putChar
   #55 = Utf8               (C)Ljava/nio/ByteBuffer;
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/location/Location.getX:()I
   #57 = Class              #59           // ext/mods/gameserver/model/location/Location
   #58 = NameAndType        #60:#47       // getX:()I
   #59 = Utf8               ext/mods/gameserver/model/location/Location
   #60 = Utf8               getX
   #61 = Methodref          #8.#62        // ext/mods/commons/mmocore/SendablePacket.writeD:(I)V
   #62 = NameAndType        #63:#64       // writeD:(I)V
   #63 = Utf8               writeD
   #64 = Utf8               (I)V
   #65 = Methodref          #57.#66       // ext/mods/gameserver/model/location/Location.getY:()I
   #66 = NameAndType        #67:#47       // getY:()I
   #67 = Utf8               getY
   #68 = Methodref          #57.#69       // ext/mods/gameserver/model/location/Location.getZ:()I
   #69 = NameAndType        #70:#47       // getZ:()I
   #70 = Utf8               getZ
   #71 = Methodref          #72.#73       // ext/mods/gameserver/model/records/EffectHolder.id:()I
   #72 = Class              #74           // ext/mods/gameserver/model/records/EffectHolder
   #73 = NameAndType        #75:#47       // id:()I
   #74 = Utf8               ext/mods/gameserver/model/records/EffectHolder
   #75 = Utf8               id
   #76 = Methodref          #72.#77       // ext/mods/gameserver/model/records/EffectHolder.level:()I
   #77 = NameAndType        #78:#47       // level:()I
   #78 = Utf8               level
   #79 = Methodref          #8.#80        // ext/mods/commons/mmocore/SendablePacket.writeH:(I)V
   #80 = NameAndType        #81:#64       // writeH:(I)V
   #81 = Utf8               writeH
   #82 = Methodref          #72.#83       // ext/mods/gameserver/model/records/EffectHolder.duration:()I
   #83 = NameAndType        #84:#47       // duration:()I
   #84 = Utf8               duration
   #85 = Utf8               Code
   #86 = Utf8               LineNumberTable
   #87 = Utf8               LocalVariableTable
   #88 = Utf8               this
   #89 = Utf8               Lext/mods/commons/mmocore/SendablePacket;
   #90 = Utf8               LocalVariableTypeTable
   #91 = Utf8               Lext/mods/commons/mmocore/SendablePacket<TT;>;
   #92 = Utf8               write
   #93 = Utf8               writeC
   #94 = Utf8               data
   #95 = Utf8               I
   #96 = Utf8               writeF
   #97 = Utf8               (D)V
   #98 = Utf8               value
   #99 = Utf8               D
  #100 = Utf8               writeQ
  #101 = Utf8               (J)V
  #102 = Utf8               J
  #103 = Utf8               writeB
  #104 = Utf8               ([B)V
  #105 = Utf8               [B
  #106 = Utf8               StackMapTable
  #107 = Utf8               writeS
  #108 = Utf8               (Ljava/lang/String;)V
  #109 = Utf8               i
  #110 = Utf8               text
  #111 = Utf8               Ljava/lang/String;
  #112 = Utf8               writeLoc
  #113 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #114 = Utf8               loc
  #115 = Utf8               Lext/mods/gameserver/model/location/Location;
  #116 = Utf8               writeEffect
  #117 = Utf8               (Lext/mods/gameserver/model/records/EffectHolder;Z)V
  #118 = Utf8               effect
  #119 = Utf8               Lext/mods/gameserver/model/records/EffectHolder;
  #120 = Utf8               toggle
  #121 = Utf8               Z
  #122 = Utf8               Signature
  #123 = Utf8               <T:Lext/mods/commons/mmocore/MMOClient<*>;>Lext/mods/commons/mmocore/AbstractPacket<TT;>;
  #124 = Utf8               SourceFile
  #125 = Utf8               SendablePacket.java
{
  public ext.mods.commons.mmocore.SendablePacket();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/mmocore/AbstractPacket."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/SendablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;

  protected abstract void write();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected final void writeC(int);
    descriptor: (I)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: iload_1
         5: i2b
         6: invokevirtual #13                 // Method java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
         9: pop
        10: return
      LineNumberTable:
        line 29: 0
        line 30: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      11     1  data   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;

  protected final void writeF(double);
    descriptor: (D)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: dload_1
         5: invokevirtual #19                 // Method java/nio/ByteBuffer.putDouble:(D)Ljava/nio/ByteBuffer;
         8: pop
         9: return
      LineNumberTable:
        line 34: 0
        line 35: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      10     1 value   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;

  protected final void writeH(int);
    descriptor: (I)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: iload_1
         5: i2s
         6: invokevirtual #23                 // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
         9: pop
        10: return
      LineNumberTable:
        line 39: 0
        line 40: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      11     1 value   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;

  protected final void writeD(int);
    descriptor: (I)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: iload_1
         5: invokevirtual #27                 // Method java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
         8: pop
         9: return
      LineNumberTable:
        line 44: 0
        line 45: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      10     1 value   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;

  protected final void writeQ(long);
    descriptor: (J)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: lload_1
         5: invokevirtual #31                 // Method java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
         8: pop
         9: return
      LineNumberTable:
        line 49: 0
        line 50: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      10     1 value   J
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;

  protected final void writeB(byte[]);
    descriptor: ([B)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        18
         4: aload_1
         5: arraylength
         6: ifle          18
         9: aload_0
        10: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
        13: aload_1
        14: invokevirtual #35                 // Method java/nio/ByteBuffer.put:([B)Ljava/nio/ByteBuffer;
        17: pop
        18: return
      LineNumberTable:
        line 54: 0
        line 55: 9
        line 56: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      19     1  data   [B
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  protected final void writeS(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: ifnull        40
         4: aload_1
         5: invokevirtual #38                 // Method java/lang/String.isEmpty:()Z
         8: ifne          40
        11: iconst_0
        12: istore_2
        13: iload_2
        14: aload_1
        15: invokevirtual #44                 // Method java/lang/String.length:()I
        18: if_icmpge     40
        21: aload_0
        22: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
        25: aload_1
        26: iload_2
        27: invokevirtual #48                 // Method java/lang/String.charAt:(I)C
        30: invokevirtual #52                 // Method java/nio/ByteBuffer.putChar:(C)Ljava/nio/ByteBuffer;
        33: pop
        34: iinc          2, 1
        37: goto          13
        40: aload_0
        41: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
        44: iconst_0
        45: invokevirtual #52                 // Method java/nio/ByteBuffer.putChar:(C)Ljava/nio/ByteBuffer;
        48: pop
        49: return
      LineNumberTable:
        line 60: 0
        line 62: 11
        line 63: 21
        line 62: 34
        line 66: 40
        line 67: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      27     2     i   I
            0      50     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      50     1  text   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 26

  protected final void writeLoc(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #56                 // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: invokevirtual #61                 // Method writeD:(I)V
         8: aload_0
         9: aload_1
        10: invokevirtual #65                 // Method ext/mods/gameserver/model/location/Location.getY:()I
        13: invokevirtual #61                 // Method writeD:(I)V
        16: aload_0
        17: aload_1
        18: invokevirtual #68                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        21: invokevirtual #61                 // Method writeD:(I)V
        24: return
      LineNumberTable:
        line 71: 0
        line 72: 8
        line 73: 16
        line 74: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      25     1   loc   Lext/mods/gameserver/model/location/Location;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;

  protected void writeEffect(ext.mods.gameserver.model.records.EffectHolder, boolean);
    descriptor: (Lext/mods/gameserver/model/records/EffectHolder;Z)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #71                 // Method ext/mods/gameserver/model/records/EffectHolder.id:()I
         5: invokevirtual #61                 // Method writeD:(I)V
         8: aload_0
         9: aload_1
        10: invokevirtual #76                 // Method ext/mods/gameserver/model/records/EffectHolder.level:()I
        13: invokevirtual #79                 // Method writeH:(I)V
        16: aload_0
        17: iload_2
        18: ifeq          25
        21: iconst_m1
        22: goto          33
        25: aload_1
        26: invokevirtual #82                 // Method ext/mods/gameserver/model/records/EffectHolder.duration:()I
        29: sipush        1000
        32: idiv
        33: invokevirtual #61                 // Method writeD:(I)V
        36: return
      LineNumberTable:
        line 78: 0
        line 79: 8
        line 80: 16
        line 81: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/commons/mmocore/SendablePacket;
            0      37     1 effect   Lext/mods/gameserver/model/records/EffectHolder;
            0      37     2 toggle   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/commons/mmocore/SendablePacket<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 89 /* same_locals_1_stack_item */
          stack = [ class ext/mods/commons/mmocore/SendablePacket ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/commons/mmocore/SendablePacket, class ext/mods/gameserver/model/records/EffectHolder, int ]
          stack = [ class ext/mods/commons/mmocore/SendablePacket, int ]
}
Signature: #123                         // <T:Lext/mods/commons/mmocore/MMOClient<*>;>Lext/mods/commons/mmocore/AbstractPacket<TT;>;
SourceFile: "SendablePacket.java"
