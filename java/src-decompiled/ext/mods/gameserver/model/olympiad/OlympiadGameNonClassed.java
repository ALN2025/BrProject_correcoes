// Bytecode for: ext.mods.gameserver.model.olympiad.OlympiadGameNonClassed
// File: ext\mods\gameserver\model\olympiad\OlympiadGameNonClassed.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed.class
  Last modified 9 de jul de 2026; size 1698 bytes
  MD5 checksum 98b77a9536961970483121e2df7be737
  Compiled from "OlympiadGameNonClassed.java"
public class ext.mods.gameserver.model.olympiad.OlympiadGameNonClassed extends ext.mods.gameserver.model.olympiad.OlympiadGameNormal
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #27                         // ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed
  super_class: #2                         // ext/mods/gameserver/model/olympiad/OlympiadGameNormal
  interfaces: 0, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/olympiad/OlympiadGameNormal."<init>":(I[Lext/mods/gameserver/model/olympiad/Participant;)V
   #2 = Class              #4             // ext/mods/gameserver/model/olympiad/OlympiadGameNormal
   #3 = NameAndType        #5:#6          // "<init>":(I[Lext/mods/gameserver/model/olympiad/Participant;)V
   #4 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameNormal
   #5 = Utf8               <init>
   #6 = Utf8               (I[Lext/mods/gameserver/model/olympiad/Participant;)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/OlympiadType.NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
   #8 = Class              #10            // ext/mods/gameserver/enums/OlympiadType
   #9 = NameAndType        #11:#12        // NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #10 = Utf8               ext/mods/gameserver/enums/OlympiadType
  #11 = Utf8               NON_CLASSED
  #12 = Utf8               Lext/mods/gameserver/enums/OlympiadType;
  #13 = Fieldref           #14.#15        // ext/mods/Config.OLY_DIVIDER_NON_CLASSED:I
  #14 = Class              #16            // ext/mods/Config
  #15 = NameAndType        #17:#18        // OLY_DIVIDER_NON_CLASSED:I
  #16 = Utf8               ext/mods/Config
  #17 = Utf8               OLY_DIVIDER_NON_CLASSED
  #18 = Utf8               I
  #19 = Fieldref           #14.#20        // ext/mods/Config.OLY_NONCLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #20 = NameAndType        #21:#22        // OLY_NONCLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #21 = Utf8               OLY_NONCLASSED_REWARD
  #22 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #23 = Methodref          #2.#24         // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.createListOfParticipants:(Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
  #24 = NameAndType        #25:#26        // createListOfParticipants:(Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
  #25 = Utf8               createListOfParticipants
  #26 = Utf8               (Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
  #27 = Class              #28            // ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed
  #28 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed
  #29 = Methodref          #27.#3         // ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed."<init>":(I[Lext/mods/gameserver/model/olympiad/Participant;)V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
  #35 = Utf8               id
  #36 = Utf8               opponents
  #37 = Utf8               [Lext/mods/gameserver/model/olympiad/Participant;
  #38 = Utf8               getType
  #39 = Utf8               ()Lext/mods/gameserver/enums/OlympiadType;
  #40 = Utf8               getDivider
  #41 = Utf8               ()I
  #42 = Utf8               getReward
  #43 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #44 = Utf8               createGame
  #45 = Utf8               (ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
  #46 = Utf8               list
  #47 = Utf8               Ljava/util/List;
  #48 = Utf8               LocalVariableTypeTable
  #49 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #50 = Utf8               StackMapTable
  #51 = Class              #37            // "[Lext/mods/gameserver/model/olympiad/Participant;"
  #52 = Utf8               Signature
  #53 = Utf8               (ILjava/util/List<Ljava/lang/Integer;>;)Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
  #54 = Utf8               SourceFile
  #55 = Utf8               OlympiadGameNonClassed.java
{
  public final ext.mods.gameserver.enums.OlympiadType getType();
    descriptor: ()Lext/mods/gameserver/enums/OlympiadType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/OlympiadType.NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
         3: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;

  protected final int getDivider();
    descriptor: ()I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #13                 // Field ext/mods/Config.OLY_DIVIDER_NON_CLASSED:I
         3: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;

  protected final ext.mods.gameserver.model.holder.IntIntHolder[] getReward();
    descriptor: ()[Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #19                 // Field ext/mods/Config.OLY_NONCLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
         3: areturn
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;

  protected static final ext.mods.gameserver.model.olympiad.OlympiadGameNonClassed createGame(int, java.util.List<java.lang.Integer>);
    descriptor: (ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: invokestatic  #23                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameNormal.createListOfParticipants:(Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
         4: astore_2
         5: aload_2
         6: ifnonnull     11
         9: aconst_null
        10: areturn
        11: new           #27                 // class ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed
        14: dup
        15: iload_0
        16: aload_2
        17: invokespecial #29                 // Method "<init>":(I[Lext/mods/gameserver/model/olympiad/Participant;)V
        20: areturn
      LineNumberTable:
        line 53: 0
        line 54: 5
        line 55: 9
        line 57: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0    id   I
            0      21     1  list   Ljava/util/List;
            5      16     2 opponents   [Lext/mods/gameserver/model/olympiad/Participant;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      21     1  list   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/olympiad/Participant;" ]
    Signature: #53                          // (ILjava/util/List<Ljava/lang/Integer;>;)Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
}
SourceFile: "OlympiadGameNonClassed.java"
