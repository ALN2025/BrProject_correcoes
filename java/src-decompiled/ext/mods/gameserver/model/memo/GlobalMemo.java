// Bytecode for: ext.mods.gameserver.model.memo.GlobalMemo
// File: ext\mods\gameserver\model\memo\GlobalMemo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/memo/GlobalMemo.class
  Last modified 9 de jul de 2026; size 2267 bytes
  MD5 checksum e4baeb2cacb40a99ddcb3e3ead166af5
  Compiled from "GlobalMemo.java"
public class ext.mods.gameserver.model.memo.GlobalMemo extends ext.mods.commons.data.MemoSet
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // ext/mods/gameserver/model/memo/GlobalMemo
  super_class: #2                         // ext/mods/commons/data/MemoSet
  interfaces: 0, fields: 2, methods: 8, attributes: 3
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
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/model/memo/GlobalMemo$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/memo/GlobalMemo;
  #14 = Class              #16            // ext/mods/gameserver/model/memo/GlobalMemo$SingletonHolder
  #15 = NameAndType        #17:#18        // INSTANCE:Lext/mods/gameserver/model/memo/GlobalMemo;
  #16 = Utf8               ext/mods/gameserver/model/memo/GlobalMemo$SingletonHolder
  #17 = Utf8               INSTANCE
  #18 = Utf8               Lext/mods/gameserver/model/memo/GlobalMemo;
  #19 = Methodref          #20.#21        // ext/mods/gameserver/model/memo/GlobalMemo.getInteger:(Ljava/lang/String;I)I
  #20 = Class              #22            // ext/mods/gameserver/model/memo/GlobalMemo
  #21 = NameAndType        #23:#24        // getInteger:(Ljava/lang/String;I)I
  #22 = Utf8               ext/mods/gameserver/model/memo/GlobalMemo
  #23 = Utf8               getInteger
  #24 = Utf8               (Ljava/lang/String;I)I
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #26 = Class              #28            // ext/mods/gameserver/model/World
  #27 = NameAndType        #29:#30        // getInstance:()Lext/mods/gameserver/model/World;
  #28 = Utf8               ext/mods/gameserver/model/World
  #29 = Utf8               getInstance
  #30 = Utf8               ()Lext/mods/gameserver/model/World;
  #31 = Methodref          #26.#32        // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #32 = NameAndType        #33:#34        // getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #33 = Utf8               getObject
  #34 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
  #35 = Class              #36            // ext/mods/gameserver/model/actor/Npc
  #36 = Utf8               ext/mods/gameserver/model/actor/Npc
  #37 = Methodref          #35.#38        // ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
  #38 = NameAndType        #39:#40        // isDecayed:()Z
  #39 = Utf8               isDecayed
  #40 = Utf8               ()Z
  #41 = Class              #42            // ext/mods/gameserver/model/actor/Creature
  #42 = Utf8               ext/mods/gameserver/model/actor/Creature
  #43 = Methodref          #20.#3         // ext/mods/gameserver/model/memo/GlobalMemo."<init>":()V
  #44 = Fieldref           #20.#45        // ext/mods/gameserver/model/memo/GlobalMemo.DUMMY_SET:Lext/mods/gameserver/model/memo/GlobalMemo;
  #45 = NameAndType        #46:#18        // DUMMY_SET:Lext/mods/gameserver/model/memo/GlobalMemo;
  #46 = Utf8               DUMMY_SET
  #47 = Utf8               serialVersionUID
  #48 = Utf8               J
  #49 = Utf8               ConstantValue
  #50 = Long               1l
  #52 = Utf8               Code
  #53 = Utf8               LineNumberTable
  #54 = Utf8               LocalVariableTable
  #55 = Utf8               this
  #56 = Utf8               size
  #57 = Utf8               I
  #58 = Utf8               m
  #59 = Utf8               Ljava/util/Map;
  #60 = Utf8               LocalVariableTypeTable
  #61 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #62 = Utf8               Signature
  #63 = Utf8               (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V
  #64 = Utf8               onSet
  #65 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #66 = Utf8               key
  #67 = Utf8               Ljava/lang/String;
  #68 = Utf8               value
  #69 = Utf8               onUnset
  #70 = Utf8               (Ljava/lang/String;)V
  #71 = Utf8               ()Lext/mods/gameserver/model/memo/GlobalMemo;
  #72 = Utf8               getCreature
  #73 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Creature;
  #74 = Utf8               npc
  #75 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #76 = Utf8               creature
  #77 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #78 = Utf8               str
  #79 = Utf8               id
  #80 = Utf8               object
  #81 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #82 = Utf8               StackMapTable
  #83 = Class              #84            // ext/mods/gameserver/model/WorldObject
  #84 = Utf8               ext/mods/gameserver/model/WorldObject
  #85 = Utf8               <clinit>
  #86 = Utf8               SourceFile
  #87 = Utf8               GlobalMemo.java
  #88 = Utf8               NestMembers
  #89 = Utf8               InnerClasses
  #90 = Utf8               SingletonHolder
{
  public static final ext.mods.gameserver.model.memo.GlobalMemo DUMMY_SET;
    descriptor: Lext/mods/gameserver/model/memo/GlobalMemo;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.model.memo.GlobalMemo();
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
            0       5     0  this   Lext/mods/gameserver/model/memo/GlobalMemo;

  public ext.mods.gameserver.model.memo.GlobalMemo(int);
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
            0       6     0  this   Lext/mods/gameserver/model/memo/GlobalMemo;
            0       6     1  size   I

  public ext.mods.gameserver.model.memo.GlobalMemo(java.util.Map<java.lang.String, java.lang.String>);
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
            0       6     0  this   Lext/mods/gameserver/model/memo/GlobalMemo;
            0       6     1     m   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     1     m   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
    Signature: #63                          // (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V

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
            0       1     0  this   Lext/mods/gameserver/model/memo/GlobalMemo;
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
            0       1     0  this   Lext/mods/gameserver/model/memo/GlobalMemo;
            0       1     1   key   Ljava/lang/String;

  public static final ext.mods.gameserver.model.memo.GlobalMemo getInstance();
    descriptor: ()Lext/mods/gameserver/model/memo/GlobalMemo;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field ext/mods/gameserver/model/memo/GlobalMemo$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/memo/GlobalMemo;
         3: areturn
      LineNumberTable:
        line 65: 0

  public final ext.mods.gameserver.model.actor.Creature getCreature(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #19                 // Method getInteger:(Ljava/lang/String;I)I
         6: istore_2
         7: iload_2
         8: ifne          13
        11: aconst_null
        12: areturn
        13: invokestatic  #25                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        16: iload_2
        17: invokevirtual #31                 // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        20: astore_3
        21: aload_3
        22: ifnull        46
        25: aload_3
        26: instanceof    #35                 // class ext/mods/gameserver/model/actor/Npc
        29: ifeq          48
        32: aload_3
        33: checkcast     #35                 // class ext/mods/gameserver/model/actor/Npc
        36: astore        4
        38: aload         4
        40: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
        43: ifeq          48
        46: aconst_null
        47: areturn
        48: aload_3
        49: instanceof    #41                 // class ext/mods/gameserver/model/actor/Creature
        52: ifeq          66
        55: aload_3
        56: checkcast     #41                 // class ext/mods/gameserver/model/actor/Creature
        59: astore        4
        61: aload         4
        63: goto          67
        66: aconst_null
        67: areturn
      LineNumberTable:
        line 70: 0
        line 71: 7
        line 72: 11
        line 74: 13
        line 75: 21
        line 76: 46
        line 78: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38       8     4   npc   Lext/mods/gameserver/model/actor/Npc;
           61       5     4 creature   Lext/mods/gameserver/model/actor/Creature;
            0      68     0  this   Lext/mods/gameserver/model/memo/GlobalMemo;
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
         0: new           #20                 // class ext/mods/gameserver/model/memo/GlobalMemo
         3: dup
         4: invokespecial #43                 // Method "<init>":()V
         7: putstatic     #44                 // Field DUMMY_SET:Lext/mods/gameserver/model/memo/GlobalMemo;
        10: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "GlobalMemo.java"
NestMembers:
  ext/mods/gameserver/model/memo/GlobalMemo$SingletonHolder
