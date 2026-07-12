// Bytecode for: ext.mods.gameserver.data.manager.EventsDropManager$RewardRule
// File: ext\mods\gameserver\data\manager\EventsDropManager$RewardRule.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.class
  Last modified 9 de jul de 2026; size 3391 bytes
  MD5 checksum af6e8204dfbb9bee8a1037c00ca3037d
  Compiled from "EventsDropManager.java"
public final class ext.mods.gameserver.data.manager.EventsDropManager$RewardRule extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 5, methods: 10, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.rewardCnt:I
    #8 = Class              #10           // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule
    #9 = NameAndType        #11:#12       // rewardCnt:I
   #10 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager$RewardRule
   #11 = Utf8               rewardCnt
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.eventName:Ljava/lang/String;
   #14 = NameAndType        #15:#16       // eventName:Ljava/lang/String;
   #15 = Utf8               eventName
   #16 = Utf8               Ljava/lang/String;
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.ruleType:Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
   #18 = NameAndType        #19:#20       // ruleType:Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
   #19 = Utf8               ruleType
   #20 = Utf8               Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.levDifferenceControl:Z
   #22 = NameAndType        #23:#24       // levDifferenceControl:Z
   #23 = Utf8               levDifferenceControl
   #24 = Utf8               Z
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.items:Ljava/util/List;
   #26 = NameAndType        #27:#28       // items:Ljava/util/List;
   #27 = Utf8               items
   #28 = Utf8               Ljava/util/List;
   #29 = InterfaceMethodref #30.#31       // java/util/List.size:()I
   #30 = Class              #32           // java/util/List
   #31 = NameAndType        #33:#34       // size:()I
   #32 = Utf8               java/util/List
   #33 = Utf8               size
   #34 = Utf8               ()I
   #35 = Methodref          #8.#36        // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule."<init>":(ILjava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;ZLjava/util/List;)V
   #36 = NameAndType        #5:#37        // "<init>":(ILjava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;ZLjava/util/List;)V
   #37 = Utf8               (ILjava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;ZLjava/util/List;)V
   #38 = InvokeDynamic      #0:#39        // #0:toString:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Ljava/lang/String;
   #39 = NameAndType        #40:#41       // toString:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Ljava/lang/String;
   #40 = Utf8               toString
   #41 = Utf8               (Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Ljava/lang/String;
   #42 = InvokeDynamic      #0:#43        // #0:hashCode:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)I
   #43 = NameAndType        #44:#45       // hashCode:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)I
   #44 = Utf8               hashCode
   #45 = Utf8               (Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)I
   #46 = InvokeDynamic      #0:#47        // #0:equals:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;Ljava/lang/Object;)Z
   #47 = NameAndType        #48:#49       // equals:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;Ljava/lang/Object;)Z
   #48 = Utf8               equals
   #49 = Utf8               (Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;Ljava/lang/Object;)Z
   #50 = Utf8               Signature
   #51 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
   #52 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
   #53 = Utf8               Code
   #54 = Utf8               LineNumberTable
   #55 = Utf8               LocalVariableTable
   #56 = Utf8               this
   #57 = Utf8               Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;
   #58 = Utf8               LocalVariableTypeTable
   #59 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;Z)V
   #60 = Utf8               MethodParameters
   #61 = Utf8               (ILjava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;ZLjava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V
   #62 = Utf8               ()Ljava/lang/String;
   #63 = Utf8               (Ljava/lang/Object;)Z
   #64 = Utf8               o
   #65 = Utf8               Ljava/lang/Object;
   #66 = Utf8               ()Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
   #67 = Utf8               ()Z
   #68 = Utf8               ()Ljava/util/List;
   #69 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
   #70 = Utf8               SourceFile
   #71 = Utf8               EventsDropManager.java
   #72 = Utf8               NestHost
   #73 = Class              #74           // ext/mods/gameserver/data/manager/EventsDropManager
   #74 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager
   #75 = Utf8               Record
   #76 = Utf8               BootstrapMethods
   #77 = String             #78           // rewardCnt;eventName;ruleType;levDifferenceControl;items
   #78 = Utf8               rewardCnt;eventName;ruleType;levDifferenceControl;items
   #79 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.rewardCnt:I
   #80 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.eventName:Ljava/lang/String;
   #81 = MethodHandle       1:#17         // REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.ruleType:Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
   #82 = MethodHandle       1:#21         // REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.levDifferenceControl:Z
   #83 = MethodHandle       1:#25         // REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.items:Ljava/util/List;
   #84 = MethodHandle       6:#85         // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #85 = Methodref          #86.#87       // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #86 = Class              #88           // java/lang/runtime/ObjectMethods
   #87 = NameAndType        #89:#90       // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #88 = Utf8               java/lang/runtime/ObjectMethods
   #89 = Utf8               bootstrap
   #90 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #91 = Utf8               InnerClasses
   #92 = Utf8               RewardRule
   #93 = Class              #94           // ext/mods/gameserver/data/manager/EventsDropManager$RuleType
   #94 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager$RuleType
   #95 = Utf8               RuleType
   #96 = Class              #97           // java/lang/invoke/MethodHandles$Lookup
   #97 = Utf8               java/lang/invoke/MethodHandles$Lookup
   #98 = Class              #99           // java/lang/invoke/MethodHandles
   #99 = Utf8               java/lang/invoke/MethodHandles
  #100 = Utf8               Lookup
{
  public ext.mods.gameserver.data.manager.EventsDropManager$RewardRule(java.lang.String, ext.mods.gameserver.data.manager.EventsDropManager$RuleType, java.util.List<ext.mods.gameserver.model.records.custom.EventItem>, boolean);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=5
         0: aload_0
         1: aload_3
         2: invokeinterface #29,  1           // InterfaceMethod java/util/List.size:()I
         7: aload_1
         8: aload_2
         9: iload         4
        11: aload_3
        12: invokespecial #35                 // Method "<init>":(ILjava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;ZLjava/util/List;)V
        15: return
      LineNumberTable:
        line 170: 0
        line 171: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;
            0      16     1 eventName   Ljava/lang/String;
            0      16     2 ruleType   Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
            0      16     3 items   Ljava/util/List;
            0      16     4 levDifferenceControl   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     3 items   Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
    Signature: #59                          // (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;Z)V

  public ext.mods.gameserver.data.manager.EventsDropManager$RewardRule(int, java.lang.String, ext.mods.gameserver.data.manager.EventsDropManager$RuleType, boolean, java.util.List<ext.mods.gameserver.model.records.custom.EventItem>);
    descriptor: (ILjava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;ZLjava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field rewardCnt:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field eventName:Ljava/lang/String;
        14: aload_0
        15: aload_3
        16: putfield      #17                 // Field ruleType:Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
        19: aload_0
        20: iload         4
        22: putfield      #21                 // Field levDifferenceControl:Z
        25: aload_0
        26: aload         5
        28: putfield      #25                 // Field items:Ljava/util/List;
        31: return
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;
            0      32     1 rewardCnt   I
            0      32     2 eventName   Ljava/lang/String;
            0      32     3 ruleType   Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
            0      32     4 levDifferenceControl   Z
            0      32     5 items   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      32     5 items   Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
    MethodParameters:
      Name                           Flags
      rewardCnt
      eventName
      ruleType
      levDifferenceControl
      items
    Signature: #61                          // (ILjava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;ZLjava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #38,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #42,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)I
         6: ireturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #46,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;
            0       8     1     o   Ljava/lang/Object;

  public int rewardCnt();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field rewardCnt:I
         4: ireturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;

  public java.lang.String eventName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field eventName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;

  public ext.mods.gameserver.data.manager.EventsDropManager$RuleType ruleType();
    descriptor: ()Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field ruleType:Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
         4: areturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;

  public boolean levDifferenceControl();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field levDifferenceControl:Z
         4: ireturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;

  public java.util.List<ext.mods.gameserver.model.records.custom.EventItem> items();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field items:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;
    Signature: #69                          // ()Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
}
SourceFile: "EventsDropManager.java"
NestHost: class ext/mods/gameserver/data/manager/EventsDropManager
  Record: length = 0x28 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 14 00 00 00 17 00 18 00 00 00 1B 00 1C 00 01
   00 32 00 00 00 02 00 33
BootstrapMethods:
  0: #84 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/data/manager/EventsDropManager$RewardRule
      #77 rewardCnt;eventName;ruleType;levDifferenceControl;items
      #79 REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.rewardCnt:I
      #80 REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.eventName:Ljava/lang/String;
      #81 REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.ruleType:Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
      #82 REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.levDifferenceControl:Z
      #83 REF_getField ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.items:Ljava/util/List;
InnerClasses:
  public static final #92= #8 of #73;     // RewardRule=class ext/mods/gameserver/data/manager/EventsDropManager$RewardRule of class ext/mods/gameserver/data/manager/EventsDropManager
  public static final #95= #93 of #73;    // RuleType=class ext/mods/gameserver/data/manager/EventsDropManager$RuleType of class ext/mods/gameserver/data/manager/EventsDropManager
  public static final #100= #96 of #98;   // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
