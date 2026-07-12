// Bytecode for: ext.mods.gameserver.model.RoomInfo
// File: ext\mods\gameserver\model\RoomInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/RoomInfo.class
  Last modified 9 de jul de 2026; size 3512 bytes
  MD5 checksum 0504d19f8cd293aea4a0f1e3d0541cf2
  Compiled from "RoomInfo.java"
public class ext.mods.gameserver.model.RoomInfo
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/RoomInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 12, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/atomic/AtomicBoolean
    #8 = Utf8               java/util/concurrent/atomic/AtomicBoolean
    #9 = Methodref          #7.#3         // java/util/concurrent/atomic/AtomicBoolean."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/RoomInfo._isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
   #11 = Class              #13           // ext/mods/gameserver/model/RoomInfo
   #12 = NameAndType        #14:#15       // _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
   #13 = Utf8               ext/mods/gameserver/model/RoomInfo
   #14 = Utf8               _isLocked
   #15 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/RoomInfo._index:I
   #17 = NameAndType        #18:#19       // _index:I
   #18 = Utf8               _index
   #19 = Utf8               I
   #20 = Fieldref           #11.#21       // ext/mods/gameserver/model/RoomInfo._time:I
   #21 = NameAndType        #22:#19       // _time:I
   #22 = Utf8               _time
   #23 = Fieldref           #11.#24       // ext/mods/gameserver/model/RoomInfo._party:Lext/mods/gameserver/model/group/Party;
   #24 = NameAndType        #25:#26       // _party:Lext/mods/gameserver/model/group/Party;
   #25 = Utf8               _party
   #26 = Utf8               Lext/mods/gameserver/model/group/Party;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
   #28 = Class              #30           // ext/mods/gameserver/model/group/Party
   #29 = NameAndType        #31:#32       // getMembers:()Ljava/util/List;
   #30 = Utf8               ext/mods/gameserver/model/group/Party
   #31 = Utf8               getMembers
   #32 = Utf8               ()Ljava/util/List;
   #33 = InterfaceMethodref #34.#35       // java/util/List.stream:()Ljava/util/stream/Stream;
   #34 = Class              #36           // java/util/List
   #35 = NameAndType        #37:#38       // stream:()Ljava/util/stream/Stream;
   #36 = Utf8               java/util/List
   #37 = Utf8               stream
   #38 = Utf8               ()Ljava/util/stream/Stream;
   #39 = InvokeDynamic      #0:#40        // #0:apply:()Ljava/util/function/Function;
   #40 = NameAndType        #41:#42       // apply:()Ljava/util/function/Function;
   #41 = Utf8               apply
   #42 = Utf8               ()Ljava/util/function/Function;
   #43 = InterfaceMethodref #44.#45       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #44 = Class              #46           // java/util/stream/Stream
   #45 = NameAndType        #47:#48       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #46 = Utf8               java/util/stream/Stream
   #47 = Utf8               map
   #48 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #49 = InterfaceMethodref #44.#50       // java/util/stream/Stream.toList:()Ljava/util/List;
   #50 = NameAndType        #51:#32       // toList:()Ljava/util/List;
   #51 = Utf8               toList
   #52 = Fieldref           #11.#53       // ext/mods/gameserver/model/RoomInfo._memberIds:Ljava/util/List;
   #53 = NameAndType        #54:#55       // _memberIds:Ljava/util/List;
   #54 = Utf8               _memberIds
   #55 = Utf8               Ljava/util/List;
   #56 = InterfaceMethodref #34.#57       // java/util/List.size:()I
   #57 = NameAndType        #58:#59       // size:()I
   #58 = Utf8               size
   #59 = Utf8               ()I
   #60 = InvokeDynamic      #1:#61        // #1:test:(Lext/mods/gameserver/model/RoomInfo;)Ljava/util/function/Predicate;
   #61 = NameAndType        #62:#63       // test:(Lext/mods/gameserver/model/RoomInfo;)Ljava/util/function/Predicate;
   #62 = Utf8               test
   #63 = Utf8               (Lext/mods/gameserver/model/RoomInfo;)Ljava/util/function/Predicate;
   #64 = InterfaceMethodref #44.#65       // java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
   #65 = NameAndType        #66:#67       // allMatch:(Ljava/util/function/Predicate;)Z
   #66 = Utf8               allMatch
   #67 = Utf8               (Ljava/util/function/Predicate;)Z
   #68 = Methodref          #7.#69        // java/util/concurrent/atomic/AtomicBoolean.get:()Z
   #69 = NameAndType        #70:#71       // get:()Z
   #70 = Utf8               get
   #71 = Utf8               ()Z
   #72 = Methodref          #73.#74       // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #73 = Class              #75           // ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #74 = NameAndType        #76:#77       // getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #75 = Utf8               ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #76 = Utf8               getInstance
   #77 = Utf8               ()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #78 = Methodref          #73.#79       // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getCurrentTick:()I
   #79 = NameAndType        #80:#59       // getCurrentTick:()I
   #80 = Utf8               getCurrentTick
   #81 = Methodref          #7.#82        // java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
   #82 = NameAndType        #83:#84       // set:(Z)V
   #83 = Utf8               set
   #84 = Utf8               (Z)V
   #85 = Methodref          #11.#86       // ext/mods/gameserver/model/RoomInfo.setLock:(Z)V
   #86 = NameAndType        #87:#84       // setLock:(Z)V
   #87 = Utf8               setLock
   #88 = Methodref          #89.#90       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #89 = Class              #91           // ext/mods/gameserver/model/actor/Player
   #90 = NameAndType        #92:#59       // getObjectId:()I
   #91 = Utf8               ext/mods/gameserver/model/actor/Player
   #92 = Utf8               getObjectId
   #93 = Methodref          #94.#95       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #94 = Class              #96           // java/lang/Integer
   #95 = NameAndType        #97:#98       // valueOf:(I)Ljava/lang/Integer;
   #96 = Utf8               java/lang/Integer
   #97 = Utf8               valueOf
   #98 = Utf8               (I)Ljava/lang/Integer;
   #99 = InterfaceMethodref #34.#100      // java/util/List.contains:(Ljava/lang/Object;)Z
  #100 = NameAndType        #101:#102     // contains:(Ljava/lang/Object;)Z
  #101 = Utf8               contains
  #102 = Utf8               (Ljava/lang/Object;)Z
  #103 = Utf8               Signature
  #104 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #105 = Utf8               (I)V
  #106 = Utf8               Code
  #107 = Utf8               LineNumberTable
  #108 = Utf8               LocalVariableTable
  #109 = Utf8               this
  #110 = Utf8               Lext/mods/gameserver/model/RoomInfo;
  #111 = Utf8               index
  #112 = Utf8               getIndex
  #113 = Utf8               getTime
  #114 = Utf8               getParty
  #115 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #116 = Utf8               setParty
  #117 = Utf8               (Lext/mods/gameserver/model/group/Party;)V
  #118 = Utf8               party
  #119 = Utf8               isPartyChanged
  #120 = Utf8               StackMapTable
  #121 = Utf8               getMemberIds
  #122 = Utf8               ()Ljava/util/List<Ljava/lang/Integer;>;
  #123 = Utf8               isLocked
  #124 = Utf8               Z
  #125 = Utf8               clear
  #126 = Utf8               lambda$isPartyChanged$0
  #127 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #128 = Utf8               m
  #129 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #130 = Utf8               lambda$setParty$0
  #131 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Integer;
  #132 = Utf8               pm
  #133 = Utf8               SourceFile
  #134 = Utf8               RoomInfo.java
  #135 = Utf8               BootstrapMethods
  #136 = MethodType         #137          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #137 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #138 = MethodHandle       6:#139        // REF_invokeStatic ext/mods/gameserver/model/RoomInfo.lambda$setParty$0:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Integer;
  #139 = Methodref          #11.#140      // ext/mods/gameserver/model/RoomInfo.lambda$setParty$0:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Integer;
  #140 = NameAndType        #130:#131     // lambda$setParty$0:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Integer;
  #141 = MethodType         #131          //  (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Integer;
  #142 = MethodType         #102          //  (Ljava/lang/Object;)Z
  #143 = MethodHandle       5:#144        // REF_invokeVirtual ext/mods/gameserver/model/RoomInfo.lambda$isPartyChanged$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #144 = Methodref          #11.#145      // ext/mods/gameserver/model/RoomInfo.lambda$isPartyChanged$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #145 = NameAndType        #126:#127     // lambda$isPartyChanged$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #146 = MethodType         #127          //  (Lext/mods/gameserver/model/actor/Player;)Z
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
  public ext.mods.gameserver.model.RoomInfo(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/atomic/AtomicBoolean
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/atomic/AtomicBoolean."<init>":()V
        12: putfield      #10                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
        15: aload_0
        16: iload_1
        17: putfield      #16                 // Field _index:I
        20: return
      LineNumberTable:
        line 36: 0
        line 29: 4
        line 37: 15
        line 38: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/RoomInfo;
            0      21     1 index   I

  public int getIndex();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _index:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/RoomInfo;

  public int getTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _time:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/RoomInfo;

  public ext.mods.gameserver.model.group.Party getParty();
    descriptor: ()Lext/mods/gameserver/model/group/Party;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _party:Lext/mods/gameserver/model/group/Party;
         4: areturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/RoomInfo;

  public void setParty(ext.mods.gameserver.model.group.Party);
    descriptor: (Lext/mods/gameserver/model/group/Party;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #23                 // Field _party:Lext/mods/gameserver/model/group/Party;
         5: aload_0
         6: aload_1
         7: invokevirtual #27                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        10: invokeinterface #33,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        15: invokedynamic #39,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        20: invokeinterface #43,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        25: invokeinterface #49,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        30: putfield      #52                 // Field _memberIds:Ljava/util/List;
        33: return
      LineNumberTable:
        line 57: 0
        line 58: 5
        line 59: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/RoomInfo;
            0      34     1 party   Lext/mods/gameserver/model/group/Party;

  public boolean isPartyChanged();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _party:Lext/mods/gameserver/model/group/Party;
         4: ifnonnull     9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: getfield      #52                 // Field _memberIds:Ljava/util/List;
        13: invokeinterface #56,  1           // InterfaceMethod java/util/List.size:()I
        18: aload_0
        19: getfield      #23                 // Field _party:Lext/mods/gameserver/model/group/Party;
        22: invokevirtual #27                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        25: invokeinterface #56,  1           // InterfaceMethod java/util/List.size:()I
        30: if_icmpeq     35
        33: iconst_1
        34: ireturn
        35: aload_0
        36: getfield      #23                 // Field _party:Lext/mods/gameserver/model/group/Party;
        39: invokevirtual #27                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        42: invokeinterface #33,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        47: aload_0
        48: invokedynamic #60,  0             // InvokeDynamic #1:test:(Lext/mods/gameserver/model/RoomInfo;)Ljava/util/function/Predicate;
        53: invokeinterface #64,  2           // InterfaceMethod java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
        58: ifne          65
        61: iconst_1
        62: goto          66
        65: iconst_0
        66: ireturn
      LineNumberTable:
        line 66: 0
        line 67: 7
        line 69: 9
        line 70: 33
        line 72: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/RoomInfo;
      StackMapTable: number_of_entries = 4
        frame_type = 9 /* same */
        frame_type = 25 /* same */
        frame_type = 29 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.List<java.lang.Integer> getMemberIds();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _memberIds:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/RoomInfo;
    Signature: #122                         // ()Ljava/util/List<Ljava/lang/Integer;>;

  public boolean isLocked();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #68                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/RoomInfo;

  public void setLock(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokestatic  #72                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
         4: invokevirtual #78                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getCurrentTick:()I
         7: putfield      #20                 // Field _time:I
        10: aload_0
        11: getfield      #10                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
        14: iload_1
        15: invokevirtual #81                 // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        18: return
      LineNumberTable:
        line 87: 0
        line 88: 10
        line 89: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/RoomInfo;
            0      19     1 isLocked   Z

  public void clear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aconst_null
         2: putfield      #23                 // Field _party:Lext/mods/gameserver/model/group/Party;
         5: aload_0
         6: aconst_null
         7: putfield      #52                 // Field _memberIds:Ljava/util/List;
        10: aload_0
        11: iconst_0
        12: invokevirtual #85                 // Method setLock:(Z)V
        15: return
      LineNumberTable:
        line 96: 0
        line 97: 5
        line 99: 10
        line 100: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/RoomInfo;
}
SourceFile: "RoomInfo.java"
BootstrapMethods:
  0: #147 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #136 (Ljava/lang/Object;)Ljava/lang/Object;
      #138 REF_invokeStatic ext/mods/gameserver/model/RoomInfo.lambda$setParty$0:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Integer;
      #141 (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Integer;
  1: #147 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #142 (Ljava/lang/Object;)Z
      #143 REF_invokeVirtual ext/mods/gameserver/model/RoomInfo.lambda$isPartyChanged$0:(Lext/mods/gameserver/model/actor/Player;)Z
      #146 (Lext/mods/gameserver/model/actor/Player;)Z
InnerClasses:
  public static final #159= #155 of #157; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
