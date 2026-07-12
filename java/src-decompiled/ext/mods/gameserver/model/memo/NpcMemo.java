// Bytecode for: ext.mods.gameserver.model.memo.NpcMemo
// File: ext\mods\gameserver\model\memo\NpcMemo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/memo/NpcMemo.class
  Last modified 9 de jul de 2026; size 2011 bytes
  MD5 checksum da3f7ed0045837a639fabd22e1ac776e
  Compiled from "NpcMemo.java"
public class ext.mods.gameserver.model.memo.NpcMemo extends ext.mods.commons.data.MemoSet
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/memo/NpcMemo
  super_class: #2                         // ext/mods/commons/data/MemoSet
  interfaces: 0, fields: 2, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/data/MemoSet."<init>":()V
   #2 = Class              #4             // ext/mods/commons/data/MemoSet
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/commons/data/MemoSet
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #2.#8          // ext/mods/commons/data/MemoSet."<init>":(I)V
   #8 = NameAndType        #5:#9          // "<init>":(I)V
   #9 = Utf8               (I)V
  #10 = Methodref          #2.#11         // ext/mods/commons/data/MemoSet."<init>":(Ljava/util/Map;)V
  #11 = NameAndType        #5:#12         // "<init>":(Ljava/util/Map;)V
  #12 = Utf8               (Ljava/util/Map;)V
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/memo/NpcMemo.getInteger:(Ljava/lang/String;I)I
  #14 = Class              #16            // ext/mods/gameserver/model/memo/NpcMemo
  #15 = NameAndType        #17:#18        // getInteger:(Ljava/lang/String;I)I
  #16 = Utf8               ext/mods/gameserver/model/memo/NpcMemo
  #17 = Utf8               getInteger
  #18 = Utf8               (Ljava/lang/String;I)I
  #19 = Methodref          #20.#21        // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #20 = Class              #22            // ext/mods/gameserver/model/World
  #21 = NameAndType        #23:#24        // getInstance:()Lext/mods/gameserver/model/World;
  #22 = Utf8               ext/mods/gameserver/model/World
  #23 = Utf8               getInstance
  #24 = Utf8               ()Lext/mods/gameserver/model/World;
  #25 = Methodref          #20.#26        // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #26 = NameAndType        #27:#28        // getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #27 = Utf8               getObject
  #28 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
  #29 = Class              #30            // ext/mods/gameserver/model/actor/Npc
  #30 = Utf8               ext/mods/gameserver/model/actor/Npc
  #31 = Methodref          #29.#32        // ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
  #32 = NameAndType        #33:#34        // isDecayed:()Z
  #33 = Utf8               isDecayed
  #34 = Utf8               ()Z
  #35 = Class              #36            // ext/mods/gameserver/model/actor/Creature
  #36 = Utf8               ext/mods/gameserver/model/actor/Creature
  #37 = Methodref          #14.#3         // ext/mods/gameserver/model/memo/NpcMemo."<init>":()V
  #38 = Fieldref           #14.#39        // ext/mods/gameserver/model/memo/NpcMemo.DUMMY_SET:Lext/mods/gameserver/model/memo/NpcMemo;
  #39 = NameAndType        #40:#41        // DUMMY_SET:Lext/mods/gameserver/model/memo/NpcMemo;
  #40 = Utf8               DUMMY_SET
  #41 = Utf8               Lext/mods/gameserver/model/memo/NpcMemo;
  #42 = Utf8               serialVersionUID
  #43 = Utf8               J
  #44 = Utf8               ConstantValue
  #45 = Long               1l
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               this
  #51 = Utf8               size
  #52 = Utf8               I
  #53 = Utf8               m
  #54 = Utf8               Ljava/util/Map;
  #55 = Utf8               LocalVariableTypeTable
  #56 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #57 = Utf8               Signature
  #58 = Utf8               (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V
  #59 = Utf8               onSet
  #60 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #61 = Utf8               key
  #62 = Utf8               Ljava/lang/String;
  #63 = Utf8               value
  #64 = Utf8               onUnset
  #65 = Utf8               (Ljava/lang/String;)V
  #66 = Utf8               getCreature
  #67 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Creature;
  #68 = Utf8               npc
  #69 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #70 = Utf8               creature
  #71 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #72 = Utf8               str
  #73 = Utf8               id
  #74 = Utf8               object
  #75 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #76 = Utf8               StackMapTable
  #77 = Class              #78            // ext/mods/gameserver/model/WorldObject
  #78 = Utf8               ext/mods/gameserver/model/WorldObject
  #79 = Utf8               <clinit>
  #80 = Utf8               SourceFile
  #81 = Utf8               NpcMemo.java
{
  public static final ext.mods.gameserver.model.memo.NpcMemo DUMMY_SET;
    descriptor: Lext/mods/gameserver/model/memo/NpcMemo;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.model.memo.NpcMemo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/data/MemoSet."<init>":()V
         4: return
      LineNumberTable:
        line 40: 0
        line 41: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/memo/NpcMemo;

  public ext.mods.gameserver.model.memo.NpcMemo(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #7                  // Method ext/mods/commons/data/MemoSet."<init>":(I)V
         5: return
      LineNumberTable:
        line 45: 0
        line 46: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/memo/NpcMemo;
            0       6     1  size   I

  public ext.mods.gameserver.model.memo.NpcMemo(java.util.Map<java.lang.String, java.lang.String>);
    descriptor: (Ljava/util/Map;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #10                 // Method ext/mods/commons/data/MemoSet."<init>":(Ljava/util/Map;)V
         5: return
      LineNumberTable:
        line 50: 0
        line 51: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/memo/NpcMemo;
            0       6     1     m   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     1     m   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
    Signature: #58                          // (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V

  protected void onSet(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/memo/NpcMemo;
            0       1     1   key   Ljava/lang/String;
            0       1     2 value   Ljava/lang/String;

  protected void onUnset(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/memo/NpcMemo;
            0       1     1   key   Ljava/lang/String;

  public final ext.mods.gameserver.model.actor.Creature getCreature(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #13                 // Method getInteger:(Ljava/lang/String;I)I
         6: istore_2
         7: iload_2
         8: ifne          13
        11: aconst_null
        12: areturn
        13: invokestatic  #19                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        16: iload_2
        17: invokevirtual #25                 // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        20: astore_3
        21: aload_3
        22: ifnull        46
        25: aload_3
        26: instanceof    #29                 // class ext/mods/gameserver/model/actor/Npc
        29: ifeq          48
        32: aload_3
        33: checkcast     #29                 // class ext/mods/gameserver/model/actor/Npc
        36: astore        4
        38: aload         4
        40: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
        43: ifeq          48
        46: aconst_null
        47: areturn
        48: aload_3
        49: instanceof    #35                 // class ext/mods/gameserver/model/actor/Creature
        52: ifeq          66
        55: aload_3
        56: checkcast     #35                 // class ext/mods/gameserver/model/actor/Creature
        59: astore        4
        61: aload         4
        63: goto          67
        66: aconst_null
        67: areturn
      LineNumberTable:
        line 69: 0
        line 70: 7
        line 71: 11
        line 73: 13
        line 74: 21
        line 75: 46
        line 77: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38       8     4   npc   Lext/mods/gameserver/model/actor/Npc;
           61       5     4 creature   Lext/mods/gameserver/model/actor/Creature;
            0      68     0  this   Lext/mods/gameserver/model/memo/NpcMemo;
            0      68     1   str   Ljava/lang/String;
            7      61     2    id   I
           21      47     3 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 1 /* same */
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #14                 // class ext/mods/gameserver/model/memo/NpcMemo
         3: dup
         4: invokespecial #37                 // Method "<init>":()V
         7: putstatic     #38                 // Field DUMMY_SET:Lext/mods/gameserver/model/memo/NpcMemo;
        10: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "NpcMemo.java"
