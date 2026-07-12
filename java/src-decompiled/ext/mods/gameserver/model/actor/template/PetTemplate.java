// Bytecode for: ext.mods.gameserver.model.actor.template.PetTemplate
// File: ext\mods\gameserver\model\actor\template\PetTemplate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/template/PetTemplate.class
  Last modified 9 de jul de 2026; size 2042 bytes
  MD5 checksum 3122ae5b9ba3f749b179fefaa2428b2e
  Compiled from "PetTemplate.java"
public final class ext.mods.gameserver.model.actor.template.PetTemplate extends ext.mods.gameserver.model.actor.template.NpcTemplate
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/actor/template/PetTemplate
  super_class: #2                         // ext/mods/gameserver/model/actor/template/NpcTemplate
  interfaces: 0, fields: 6, methods: 8, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/template/NpcTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/template/NpcTemplate
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/commons/data/StatSet;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #7 = String             #8             // food1
   #8 = Utf8               food1
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;)I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/model/actor/template/PetTemplate._food1:I
  #16 = Class              #18            // ext/mods/gameserver/model/actor/template/PetTemplate
  #17 = NameAndType        #19:#20        // _food1:I
  #18 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
  #19 = Utf8               _food1
  #20 = Utf8               I
  #21 = String             #22            // food2
  #22 = Utf8               food2
  #23 = Fieldref           #16.#24        // ext/mods/gameserver/model/actor/template/PetTemplate._food2:I
  #24 = NameAndType        #25:#20        // _food2:I
  #25 = Utf8               _food2
  #26 = String             #27            // autoFeedLimit
  #27 = Utf8               autoFeedLimit
  #28 = Methodref          #10.#29        // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
  #29 = NameAndType        #30:#31        // getDouble:(Ljava/lang/String;)D
  #30 = Utf8               getDouble
  #31 = Utf8               (Ljava/lang/String;)D
  #32 = Fieldref           #16.#33        // ext/mods/gameserver/model/actor/template/PetTemplate._autoFeedLimit:D
  #33 = NameAndType        #34:#35        // _autoFeedLimit:D
  #34 = Utf8               _autoFeedLimit
  #35 = Utf8               D
  #36 = String             #37            // hungryLimit
  #37 = Utf8               hungryLimit
  #38 = Fieldref           #16.#39        // ext/mods/gameserver/model/actor/template/PetTemplate._hungryLimit:D
  #39 = NameAndType        #40:#35        // _hungryLimit:D
  #40 = Utf8               _hungryLimit
  #41 = String             #42            // unsummonLimit
  #42 = Utf8               unsummonLimit
  #43 = Fieldref           #16.#44        // ext/mods/gameserver/model/actor/template/PetTemplate._unsummonLimit:D
  #44 = NameAndType        #45:#35        // _unsummonLimit:D
  #45 = Utf8               _unsummonLimit
  #46 = String             #47            // petData
  #47 = Utf8               petData
  #48 = Methodref          #10.#49        // ext/mods/commons/data/StatSet.getMap:(Ljava/lang/String;)Ljava/util/Map;
  #49 = NameAndType        #50:#51        // getMap:(Ljava/lang/String;)Ljava/util/Map;
  #50 = Utf8               getMap
  #51 = Utf8               (Ljava/lang/String;)Ljava/util/Map;
  #52 = Fieldref           #16.#53        // ext/mods/gameserver/model/actor/template/PetTemplate._dataEntries:Ljava/util/Map;
  #53 = NameAndType        #54:#55        // _dataEntries:Ljava/util/Map;
  #54 = Utf8               _dataEntries
  #55 = Utf8               Ljava/util/Map;
  #56 = Methodref          #57.#58        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #57 = Class              #59            // java/lang/Integer
  #58 = NameAndType        #60:#61        // valueOf:(I)Ljava/lang/Integer;
  #59 = Utf8               java/lang/Integer
  #60 = Utf8               valueOf
  #61 = Utf8               (I)Ljava/lang/Integer;
  #62 = InterfaceMethodref #63.#64        // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #63 = Class              #65            // java/util/Map
  #64 = NameAndType        #66:#67        // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #65 = Utf8               java/util/Map
  #66 = Utf8               get
  #67 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #68 = Class              #69            // ext/mods/gameserver/model/records/PetDataEntry
  #69 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
  #70 = Utf8               Signature
  #71 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/PetDataEntry;>;
  #72 = Utf8               Code
  #73 = Utf8               LineNumberTable
  #74 = Utf8               LocalVariableTable
  #75 = Utf8               this
  #76 = Utf8               Lext/mods/gameserver/model/actor/template/PetTemplate;
  #77 = Utf8               set
  #78 = Utf8               Lext/mods/commons/data/StatSet;
  #79 = Utf8               getFood1
  #80 = Utf8               ()I
  #81 = Utf8               getFood2
  #82 = Utf8               getAutoFeedLimit
  #83 = Utf8               ()D
  #84 = Utf8               getHungryLimit
  #85 = Utf8               getUnsummonLimit
  #86 = Utf8               getPetDataEntry
  #87 = Utf8               (I)Lext/mods/gameserver/model/records/PetDataEntry;
  #88 = Utf8               level
  #89 = Utf8               canEatFood
  #90 = Utf8               (I)Z
  #91 = Utf8               itemId
  #92 = Utf8               StackMapTable
  #93 = Utf8               SourceFile
  #94 = Utf8               PetTemplate.java
{
  public ext.mods.gameserver.model.actor.template.PetTemplate(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/template/NpcTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String food1
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        12: putfield      #15                 // Field _food1:I
        15: aload_0
        16: aload_1
        17: ldc           #21                 // String food2
        19: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        22: putfield      #23                 // Field _food2:I
        25: aload_0
        26: aload_1
        27: ldc           #26                 // String autoFeedLimit
        29: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        32: putfield      #32                 // Field _autoFeedLimit:D
        35: aload_0
        36: aload_1
        37: ldc           #36                 // String hungryLimit
        39: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        42: putfield      #38                 // Field _hungryLimit:D
        45: aload_0
        46: aload_1
        47: ldc           #41                 // String unsummonLimit
        49: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        52: putfield      #43                 // Field _unsummonLimit:D
        55: aload_0
        56: aload_1
        57: ldc           #46                 // String petData
        59: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getMap:(Ljava/lang/String;)Ljava/util/Map;
        62: putfield      #52                 // Field _dataEntries:Ljava/util/Map;
        65: return
      LineNumberTable:
        line 39: 0
        line 41: 5
        line 42: 15
        line 44: 25
        line 45: 35
        line 46: 45
        line 48: 55
        line 49: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/actor/template/PetTemplate;
            0      66     1   set   Lext/mods/commons/data/StatSet;

  public int getFood1();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _food1:I
         4: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PetTemplate;

  public int getFood2();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _food2:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PetTemplate;

  public double getAutoFeedLimit();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _autoFeedLimit:D
         4: dreturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PetTemplate;

  public double getHungryLimit();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _hungryLimit:D
         4: dreturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PetTemplate;

  public double getUnsummonLimit();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _unsummonLimit:D
         4: dreturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PetTemplate;

  public ext.mods.gameserver.model.records.PetDataEntry getPetDataEntry(int);
    descriptor: (I)Lext/mods/gameserver/model/records/PetDataEntry;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #52                 // Field _dataEntries:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #56                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #68                 // class ext/mods/gameserver/model/records/PetDataEntry
        16: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/template/PetTemplate;
            0      17     1 level   I

  public boolean canEatFood(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #15                 // Field _food1:I
         4: iload_1
         5: if_icmpeq     16
         8: aload_0
         9: getfield      #23                 // Field _food2:I
        12: iload_1
        13: if_icmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 106: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/template/PetTemplate;
            0      22     1 itemId   I
      StackMapTable: number_of_entries = 3
        frame_type = 16 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "PetTemplate.java"
