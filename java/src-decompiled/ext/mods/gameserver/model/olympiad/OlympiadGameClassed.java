// Bytecode for: ext.mods.gameserver.model.olympiad.OlympiadGameClassed
// File: ext\mods\gameserver\model\olympiad\OlympiadGameClassed.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/OlympiadGameClassed.class
  Last modified 9 de jul de 2026; size 2090 bytes
  MD5 checksum 00bb3d4fc06c4be46632759b90817a4a
  Compiled from "OlympiadGameClassed.java"
public class ext.mods.gameserver.model.olympiad.OlympiadGameClassed extends ext.mods.gameserver.model.olympiad.OlympiadGameNormal
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #47                         // ext/mods/gameserver/model/olympiad/OlympiadGameClassed
  super_class: #2                         // ext/mods/gameserver/model/olympiad/OlympiadGameNormal
  interfaces: 0, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/olympiad/OlympiadGameNormal."<init>":(I[Lext/mods/gameserver/model/olympiad/Participant;)V
   #2 = Class              #4             // ext/mods/gameserver/model/olympiad/OlympiadGameNormal
   #3 = NameAndType        #5:#6          // "<init>":(I[Lext/mods/gameserver/model/olympiad/Participant;)V
   #4 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameNormal
   #5 = Utf8               <init>
   #6 = Utf8               (I[Lext/mods/gameserver/model/olympiad/Participant;)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/OlympiadType.CLASSED:Lext/mods/gameserver/enums/OlympiadType;
   #8 = Class              #10            // ext/mods/gameserver/enums/OlympiadType
   #9 = NameAndType        #11:#12        // CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #10 = Utf8               ext/mods/gameserver/enums/OlympiadType
  #11 = Utf8               CLASSED
  #12 = Utf8               Lext/mods/gameserver/enums/OlympiadType;
  #13 = Fieldref           #14.#15        // ext/mods/Config.OLY_DIVIDER_CLASSED:I
  #14 = Class              #16            // ext/mods/Config
  #15 = NameAndType        #17:#18        // OLY_DIVIDER_CLASSED:I
  #16 = Utf8               ext/mods/Config
  #17 = Utf8               OLY_DIVIDER_CLASSED
  #18 = Utf8               I
  #19 = Fieldref           #14.#20        // ext/mods/Config.OLY_CLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #20 = NameAndType        #21:#22        // OLY_CLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #21 = Utf8               OLY_CLASSED_REWARD
  #22 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #23 = InterfaceMethodref #24.#25        // java/util/List.isEmpty:()Z
  #24 = Class              #26            // java/util/List
  #25 = NameAndType        #27:#28        // isEmpty:()Z
  #26 = Utf8               java/util/List
  #27 = Utf8               isEmpty
  #28 = Utf8               ()Z
  #29 = Methodref          #30.#31        // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #30 = Class              #32            // ext/mods/commons/random/Rnd
  #31 = NameAndType        #33:#34        // get:(Ljava/util/List;)Ljava/lang/Object;
  #32 = Utf8               ext/mods/commons/random/Rnd
  #33 = Utf8               get
  #34 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #35 = InterfaceMethodref #24.#36        // java/util/List.size:()I
  #36 = NameAndType        #37:#38        // size:()I
  #37 = Utf8               size
  #38 = Utf8               ()I
  #39 = InterfaceMethodref #24.#40        // java/util/List.remove:(Ljava/lang/Object;)Z
  #40 = NameAndType        #41:#42        // remove:(Ljava/lang/Object;)Z
  #41 = Utf8               remove
  #42 = Utf8               (Ljava/lang/Object;)Z
  #43 = Methodref          #2.#44         // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.createListOfParticipants:(Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
  #44 = NameAndType        #45:#46        // createListOfParticipants:(Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
  #45 = Utf8               createListOfParticipants
  #46 = Utf8               (Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
  #47 = Class              #48            // ext/mods/gameserver/model/olympiad/OlympiadGameClassed
  #48 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameClassed
  #49 = Methodref          #47.#3         // ext/mods/gameserver/model/olympiad/OlympiadGameClassed."<init>":(I[Lext/mods/gameserver/model/olympiad/Participant;)V
  #50 = Utf8               Code
  #51 = Utf8               LineNumberTable
  #52 = Utf8               LocalVariableTable
  #53 = Utf8               this
  #54 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
  #55 = Utf8               id
  #56 = Utf8               opponents
  #57 = Utf8               [Lext/mods/gameserver/model/olympiad/Participant;
  #58 = Utf8               getType
  #59 = Utf8               ()Lext/mods/gameserver/enums/OlympiadType;
  #60 = Utf8               getDivider
  #61 = Utf8               getReward
  #62 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #63 = Utf8               createGame
  #64 = Utf8               (ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
  #65 = Utf8               list
  #66 = Utf8               Ljava/util/List;
  #67 = Utf8               classList
  #68 = Utf8               LocalVariableTypeTable
  #69 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #70 = Utf8               Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;
  #71 = Utf8               StackMapTable
  #72 = Class              #57            // "[Lext/mods/gameserver/model/olympiad/Participant;"
  #73 = Utf8               Signature
  #74 = Utf8               (ILjava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;)Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
  #75 = Utf8               SourceFile
  #76 = Utf8               OlympiadGameClassed.java
{
  public final ext.mods.gameserver.enums.OlympiadType getType();
    descriptor: ()Lext/mods/gameserver/enums/OlympiadType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/OlympiadType.CLASSED:Lext/mods/gameserver/enums/OlympiadType;
         3: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;

  protected final int getDivider();
    descriptor: ()I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #13                 // Field ext/mods/Config.OLY_DIVIDER_CLASSED:I
         3: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;

  protected final ext.mods.gameserver.model.holder.IntIntHolder[] getReward();
    descriptor: ()[Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #19                 // Field ext/mods/Config.OLY_CLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
         3: areturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;

  protected static final ext.mods.gameserver.model.olympiad.OlympiadGameClassed createGame(int, java.util.List<java.util.List<java.lang.Integer>>);
    descriptor: (ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=2
         0: aload_1
         1: ifnull        13
         4: aload_1
         5: invokeinterface #23,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        10: ifeq          15
        13: aconst_null
        14: areturn
        15: aload_1
        16: invokeinterface #23,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        21: ifne          87
        24: aload_1
        25: invokestatic  #29                 // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
        28: checkcast     #24                 // class java/util/List
        31: astore_2
        32: aload_2
        33: ifnull        46
        36: aload_2
        37: invokeinterface #35,  1           // InterfaceMethod java/util/List.size:()I
        42: iconst_2
        43: if_icmpge     57
        46: aload_1
        47: aload_2
        48: invokeinterface #39,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        53: pop
        54: goto          15
        57: aload_2
        58: invokestatic  #43                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameNormal.createListOfParticipants:(Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
        61: astore_3
        62: aload_3
        63: ifnonnull     77
        66: aload_1
        67: aload_2
        68: invokeinterface #39,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        73: pop
        74: goto          15
        77: new           #47                 // class ext/mods/gameserver/model/olympiad/OlympiadGameClassed
        80: dup
        81: iload_0
        82: aload_3
        83: invokespecial #49                 // Method "<init>":(I[Lext/mods/gameserver/model/olympiad/Participant;)V
        86: areturn
        87: aconst_null
        88: areturn
      LineNumberTable:
        line 55: 0
        line 56: 13
        line 60: 15
        line 62: 24
        line 63: 32
        line 65: 46
        line 66: 54
        line 69: 57
        line 70: 62
        line 72: 66
        line 73: 74
        line 76: 77
        line 78: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32      55     2  list   Ljava/util/List;
           62      25     3 opponents   [Lext/mods/gameserver/model/olympiad/Participant;
            0      89     0    id   I
            0      89     1 classList   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           32      55     2  list   Ljava/util/List<Ljava/lang/Integer;>;
            0      89     1 classList   Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;
      StackMapTable: number_of_entries = 6
        frame_type = 13 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/util/List ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class "[Lext/mods/gameserver/model/olympiad/Participant;" ]
        frame_type = 249 /* chop */
          offset_delta = 9
    Signature: #74                          // (ILjava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;)Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
}
SourceFile: "OlympiadGameClassed.java"
